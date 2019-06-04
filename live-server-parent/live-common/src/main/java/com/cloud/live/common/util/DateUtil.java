package com.cloud.live.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间帮助类
 */
public class DateUtil {

    private static final String MONTH_FORMAT="yyyy-mm-dd";
    private static final String DAY_FORMAT="yyyy-mm-dd HH:mm:ss";

    /**
     * 时间格式转换成字符串格式 以 年-月-日 时:分:秒  格式输出
     * @param time
     * @return
     */
    public static String dateToStringByDay(Date time){
        SimpleDateFormat format = new SimpleDateFormat(DAY_FORMAT);
        return format.format(time);
    }

    /**
     * 时间格式转换成字符串格式 以 年-月-日  格式输出
     * @param time
     * @return
     */
    public static String dateToStringByMonth(Date time){
        SimpleDateFormat format = new SimpleDateFormat(MONTH_FORMAT);
        return format.format(time);
    }

    /**
     * 字符串转时间 字符串格式为 yyyy-mm-dd HH:mm:ss
     * @param time
     * @return
     */
    public static Date stringToDateByDay(String time){
        SimpleDateFormat format = new SimpleDateFormat(DAY_FORMAT);
        try {
            return format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 字符串转时间 字符串格式为 yyyy-mm-dd
     * @param time
     * @return
     */
    public static Date stringToDateByMonth(String time){
        SimpleDateFormat format = new SimpleDateFormat(MONTH_FORMAT);
        try {
            return format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
