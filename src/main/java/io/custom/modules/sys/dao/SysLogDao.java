

package io.custom.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.custom.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author Mark yuhe
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
