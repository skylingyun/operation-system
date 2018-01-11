package com.yonyou.common.utils;

/**
 * Redis所有Keys
 *
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2017-07-18 19:51
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }

    public static String getShiroSessionKey(String key){
        return "sessionid:" + key;
    }
}
