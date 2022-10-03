

package io.custom.modules.sys.redis;


import io.custom.common.utils.RedisKeys;
import io.custom.common.utils.RedisUtils;
import io.custom.modules.book.entity.BookMsgEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 系统配置Redis
 *
 * @author Mark yuhe
 */
@Component
public class BookMsgRedis {
    @Autowired
    private RedisUtils redisUtils;

    public void saveOrUpdate(BookMsgEntity bookMsg) {
        if(bookMsg == null || null == bookMsg.getId()){
            return ;
        }
        String key = RedisKeys.getBookMsgKey(String.valueOf(bookMsg.getId()));
        redisUtils.set(key, bookMsg);
    }

    public void delete(String bookMsgKey) {
        String key = RedisKeys.getBookMsgKey(bookMsgKey);
        redisUtils.delete(key);
    }

    public BookMsgEntity get(String bookMsgKey){
        String key = RedisKeys.getBookMsgKey(bookMsgKey);
        return redisUtils.get(key, BookMsgEntity.class);
    }
}
