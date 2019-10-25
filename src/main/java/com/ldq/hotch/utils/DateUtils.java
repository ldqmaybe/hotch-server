package com.ldq.hotch.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LinDingQiang
 * @time 2019/1/3 17:50
 * @email dingqiang.l@verifone.cn
 */
public class DateUtils {
    /**
     * 根据输入格式，，获取当前时间字符串
     *
     * @param format 格式
     * @return 时间字符串
     */
    public static String getCurrentTime(String format) {
        SimpleDateFormat df = new SimpleDateFormat(format);
        Date curDate = new Date(System.currentTimeMillis());
        return df.format(curDate);
    }
}
