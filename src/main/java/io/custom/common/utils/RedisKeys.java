

package io.custom.common.utils;

/**
 * Redis所有Keys
 *
 * @author Mark yuhe
 */
public class RedisKeys {

    public static String getBookMsgKey(String key){
        return "book:msg:" + key;
    }
}
