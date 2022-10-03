package io.custom.modules.book.service;


import com.baomidou.mybatisplus.extension.service.IService;
import io.custom.common.utils.PageUtils;
import io.custom.modules.book.entity.BookMsgEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author Mark yuhe
 */
public interface BookMsgService extends IService<BookMsgEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
