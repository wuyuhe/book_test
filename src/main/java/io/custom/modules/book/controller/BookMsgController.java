package io.custom.modules.book.controller;


import io.custom.common.annotation.SysLog;
import io.custom.common.utils.Constant;
import io.custom.common.utils.PageUtils;
import io.custom.common.utils.R;
import io.custom.common.validator.ValidatorUtils;
import io.custom.modules.book.entity.BookMsgEntity;
import io.custom.modules.book.service.BookMsgService;
import io.custom.modules.sys.redis.BookMsgRedis;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 图书管理
 *
 * @author Mark yuhe
 */
@Api(tags="图书管理模块")
@RestController
@RequestMapping("/book/msg")
public class BookMsgController {

	@Autowired
	private BookMsgService bookMsgService;
	@Autowired
	private BookMsgRedis bookMsgRedis;
	
	/**
	 * 列表
	 */
	@ApiOperation("图书列表查询")
	@ApiImplicitParam(paramType ="header",name ="token",value ="权限token",required = true)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "page", value = "当前页",paramType = "query", defaultValue = "1", required = true),
			@ApiImplicitParam(name = "limit", value = "页码大小", paramType = "query", defaultValue = "10", required = true),
			@ApiImplicitParam(name = "name", value = "图书名（模糊查询）", paramType = "query", required = false)
	})
	@GetMapping("/list")
	@RequiresPermissions("book:msg:list")
	public R list(@ApiIgnore @RequestParam Map<String, Object> params){
		PageUtils page = bookMsgService.queryPage(params);

		return R.ok().put("page", page);
	}

	/**
	 * 图书信息
	 */
	@ApiOperation("图书详情查询（通过缓存）")
	@ApiImplicitParam(paramType ="header",name ="token",value ="权限token",required = true)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "图书id主键",paramType = "query", required = true)
	})
	@GetMapping("/info")
	@RequiresPermissions("book:msg:list")
	public R info(@RequestParam Long id){
		String idStr=String.valueOf(id);
		BookMsgEntity bookMsg=bookMsgRedis.get(idStr);
		if(null == bookMsg){
			bookMsg = bookMsgService.getById(id);
			bookMsgRedis.saveOrUpdate(bookMsg);
		}

		return R.ok().put("bookMsg", bookMsg);
	}

	/**
	 * 保存图书
	 */
	@ApiOperation("保存图书")
	@ApiImplicitParam(paramType ="header",name ="token",value ="权限token",required = true)
	@SysLog("保存图书")
	@PostMapping("/save")
	@RequiresPermissions("book:msg:save")
	public R save(@RequestBody BookMsgEntity bookMsg){
		bookMsg.setId(null);
		bookMsg.setCreateTime(new Date());
		bookMsg.setStatus(Constant.BookMsgStatus.NORMAL.getValue());
		bookMsg.setUserId(null);

		bookMsgService.save(bookMsg);

		return R.ok();
	}

	/**
	 * 修改图书
	 */
	@ApiOperation("修改图书")
	@ApiImplicitParam(paramType ="header",name ="token",value ="权限token",required = true)
	@SysLog("修改图书")
	@PostMapping("/update")
	@RequiresPermissions("book:msg:update")
	public R update(@RequestBody BookMsgEntity bookMsg){
		bookMsg.setCreateTime(null);
		bookMsgService.updateById(bookMsg);

		return R.ok();
	}

	/**
	 * 删除图书
	 */
	@ApiOperation("删除图书")
	@ApiImplicitParam(paramType ="header",name ="token",value ="权限token",required = true)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "删除的图书id主键",paramType = "query", required = true)
	})
	@SysLog("删除图书")
	@PostMapping("/delete")
	@RequiresPermissions("book:msg:delete")
	public R delete(@RequestParam Long id){
		bookMsgService.removeById(id);

		return R.ok();
	}
	
}
