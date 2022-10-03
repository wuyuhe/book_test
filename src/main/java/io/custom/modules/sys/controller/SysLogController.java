

package io.custom.modules.sys.controller;

import io.custom.common.utils.PageUtils;
import io.custom.common.utils.R;
import io.custom.modules.sys.service.SysLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Map;


/**
 * 系统日志
 *
 * @author Mark yuhe
 */
@Api(tags="系统日志模块")
@Controller
@RequestMapping("/sys/log")
public class SysLogController {
	@Autowired
	private SysLogService sysLogService;
	
	/**
	 * 列表
	 */
	@ApiOperation("系统日志查询")
	@ApiImplicitParam(paramType ="header",name ="token",value ="权限token",required = true)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "page", value = "当前页",paramType = "query", defaultValue = "1", required = true),
			@ApiImplicitParam(name = "limit", value = "页码大小", paramType = "query", defaultValue = "10", required = true)
	})
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("sys:log:list")
	public R list(@ApiIgnore @RequestParam Map<String, Object> params){
		PageUtils page = sysLogService.queryPage(params);

		return R.ok().put("page", page);
	}
	
}
