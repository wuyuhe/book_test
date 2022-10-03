package io.custom.modules.book.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.custom.common.utils.PageUtils;
import io.custom.common.utils.Query;
import io.custom.modules.book.dao.BookMsgDao;
import io.custom.modules.book.entity.BookMsgEntity;
import io.custom.modules.book.service.BookMsgService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("bookMsgService")
public class BookMsgServiceImpl extends ServiceImpl<BookMsgDao, BookMsgEntity> implements BookMsgService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String name = (String)params.get("name");

        IPage<BookMsgEntity> page = this.page(
            new Query<BookMsgEntity>().getPage(params),
            new QueryWrapper<BookMsgEntity>().like(StringUtils.isNotBlank(name),"name", name)
        );

        return new PageUtils(page);
    }
}
