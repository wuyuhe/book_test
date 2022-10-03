

package io.custom.modules.sys.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 登录表单
 *
 * @author Mark yuhe
 */
@Data
public class SysLoginForm {
    @ApiModelProperty(value = "用户名",example = "admin")
    private String username;
    @ApiModelProperty(value = "密码",example = "admin")
    private String password;
}
