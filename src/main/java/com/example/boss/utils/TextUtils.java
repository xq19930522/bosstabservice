package com.example.boss.utils;

import java.text.SimpleDateFormat;
import java.util.Date;


/***
 * 创建时间：2020年2月29日14:36:44
 * 类说明：工具类
 *
 */


public class TextUtils {
    /**
     * @param str
     * @return 字符串空判
     */
    public static boolean Isempty(String str) {
        return str == null || str.length() == 0;
    }
    /**
     * 获取当前时间
     * @return
     */

    public static String getTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        return date;
    }

}
