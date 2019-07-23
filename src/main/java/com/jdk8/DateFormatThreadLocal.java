package com.jdk8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-22 20:45
 * @Version 1.0
 * @Description
 */
public class DateFormatThreadLocal {
        private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>(){
                @Override
                protected DateFormat initialValue(){
                    return new SimpleDateFormat("yyyyMMdd");
        }
        };

        public static Date convert(String source) throws ParseException {
            return df.get().parse(source);
        }
}
