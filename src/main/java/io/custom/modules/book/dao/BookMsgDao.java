package io.custom.modules.book.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.custom.modules.book.entity.BookMsgEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author Mark yuhe
 */
@Mapper
public interface BookMsgDao extends BaseMapper<BookMsgEntity> {
	
}
