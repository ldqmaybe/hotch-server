package com.ldq.hotch.utils;

/**
 * @author LinDingQiang
 * @time 2019/3/18 10:58
 * @email dingqiang.l@verifone.cn
 */
public class StringUtils {

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0 || "null".equals(str);
    }
    /**
     * null 转String
     *
     * @param str String
     * @return String
     */
    public static String null2String(String str) {
        return isEmpty(str) ? "" : str;
    }
}
