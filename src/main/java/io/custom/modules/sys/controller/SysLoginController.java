

package io.custom.modules.sys.controller;

import io.custom.common.utils.R;
import io.custom.modules.sys.entity.SysUserEntity;
import io.custom.modules.sys.form.SysLoginForm;
import io.custom.modules.sys.service.SysUserService;
import io.custom.modules.sys.service.SysUserTokenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

/**
 * 登录相关
 *
 * @author Mark yuhe
 */
@Api(tags="系统登录登出模块")
@RestController
public class SysLoginController extends AbstractController {
	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private SysUserTokenService sysUserTokenService;


	/**
	 * 登录
	 */
	@ApiOperation("系统登录")
	@PostMapping(value={"/sys/login"})
	public Map<String, Object> login(@RequestBody SysLoginForm form)throws IOException {

		//用户信息
		SysUserEntity user = sysUserService.queryByUserName(form.getUsername());

		//账号不存在、密码错误
		if(user == null || !user.getPassword().equals(new Sha256Hash(form.getPassword(), user.getSalt()).toHex())) {
			return R.error("账号或密码不正确");
		}

		//账号锁定
		if(user.getStatus() == 0){
			return R.error("账号已被锁定,请联系管理员");
		}

		//生成token，并保存到数据库
		R r = sysUserTokenService.createToken(user.getUserId());
		return r;
	}


	/**
	 * 退出
	 */
	@ApiOperation("系统登出")
	@ApiImplicitParam(paramType ="header",name ="token",value ="权限token",required = true)
	@PostMapping("/sys/logout")
	public R logout() {
		sysUserTokenService.logout(getUserId());
		return R.ok();
	}
	
}
