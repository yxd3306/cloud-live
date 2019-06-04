package com.cloud.live.common.util;

public class BaseUtil {

    /**
     * 首字母小写
     * @param simpleName
     * @return
     */
    public static String lowerFirst(String simpleName) {
        char[]chars = simpleName.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }

}
