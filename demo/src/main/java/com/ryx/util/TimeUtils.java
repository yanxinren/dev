package com.ryx.util;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * @author ryx
 * @ProjectName my-dev
 * @Description:
 * @date 2018/9/27 00279:27
 */
public class TimeUtils {

    /**
     * 消费型接口Consumer<T>
     */
    @Test
    public void test1() {
        consumo(500, (x) -> System.out.println(x));
    }

    @Test
    public void test2() {
        consumo(500, (x) -> System.out.println(x));
    }

    public static void consumo(double money, Consumer<Double> c) {

        c.accept(money - 1);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(getTime(new Date()));

    }

    public static Map<String, Date> getTime(Date nowTime) throws ParseException {
        HashMap<String, Date> dateMap = new HashMap<>();
        nowTime = new Date();
        Calendar cale = null;
        cale = Calendar.getInstance();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        String formatDate = dateFormatter.format(nowTime);


        /* 获取前月的第一天
         获取前月的最后一天*/
        cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 0);
        cale.set(Calendar.DAY_OF_MONTH, 1);
        String frist = dateFormatter.format(cale.getTime());
        cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH, 0);

        String last = dateFormatter.format(cale.getTime());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd 00:00:00");//注意格式化的表达式

        Date date = strToDate(frist);
        Date datelsi = strToDate(last);
        dateMap.put("start", date);
        dateMap.put("end", datelsi);
        return dateMap;
    }

    /**
     * 字符串转换成日期
     *
     * @param str
     * @return date
     */
    public static Date strToDate(String str) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd 00:00:00");

        ParsePosition pos = new ParsePosition(0);
        Date date = format.parse(str, pos);
        return date;
    }

}


