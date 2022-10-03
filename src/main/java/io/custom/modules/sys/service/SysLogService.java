

package io.custom.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import io.custom.common.utils.PageUtils;
import io.custom.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author Mark yuhe
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
