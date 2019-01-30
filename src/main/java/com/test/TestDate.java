package com.test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author lmm
 * @Title: TestDate
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 19-1-4下午4:42
 */
public class TestDate {

    public static Date getLastWeekMonday(Date date,Integer day) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getThisWeekMonday(date));
        cal.add(Calendar.DATE, day);
        return cal.getTime();
    }
    public static Date getThisWeekMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // 获得当前日期是一个星期的第几天
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 获得当前日期是一个星期的第几天
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
        cal.set(Calendar.HOUR_OF_DAY,0);
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        return cal.getTime();
    }

    public static void main(String[] args){
        Date date = new Date(1548901937000L);
        Date date1 = new Date(1548988337000L);
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar.setTime(date);
        calendar1.setTime(date1);

        int day = calendar.get(Calendar.DAY_OF_YEAR);
        int day2 = calendar1.get(Calendar.DAY_OF_YEAR);


        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int m =calendar.get(Calendar.MINUTE);
        System.out.println(hour);
        System.out.println(m);
        System.out.println(day2-day);

        int n= 440;
        System.out.println(n/60.0);

        Date date2 =new Date();

        System.out.println("本周一时间是："+getThisWeekMonday(date2));
        Integer subday = -1;
        System.out.println("上周1："+getLastWeekMonday(date2,subday));
    }
}
