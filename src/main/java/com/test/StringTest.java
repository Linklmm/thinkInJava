package com.test;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author
 * @Date 2019-04-30 09:45
 * @Version 1.0
 * @Description 测试split
 */
public class StringTest {
    public static void main(String[] args) {
        String workTime = "00:00-24:00";
        String[] time = workTime.split("-");
        for (int i = 0;i<time.length;i++) {
            System.out.println(time[i]);
        }
        System.out.println(time[1]);
    }
}
