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

    }
}
