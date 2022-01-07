package com.yl.util;

/**
 * @author ：jerry
 * @date ：Created in 2022/1/6 14:23
 * @description：
 * @version: V1.1
 */
import com.baomidou.mybatisplus.core.toolkit.StringUtils;

import java.util.Calendar;
import java.util.Date;

public class ShardingUtils {

    public static String getSuffixByYearMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR) + "_" + (calendar.get(Calendar.MONTH) + 1);
    }

    public static String getPrevSuffix(String suffix) {
        if (StringUtils.isBlank(suffix)) {
            return getSuffixByYearMonth(new Date());
        }
        String[] arr = suffix.split("_");
        if ("1".equals(arr[1])) {
            return (Integer.valueOf(arr[0]) - 1) + "_12";
        } else {
            return arr[0] + "_" + (Integer.valueOf(arr[1]) - 1);
        }
    }

    public static void main(String[] args) {
        String suffixByYearMonth = getSuffixByYearMonth(new Date());
        System.out.println(suffixByYearMonth);
    }

}
