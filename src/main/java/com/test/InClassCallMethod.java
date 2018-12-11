package com.test;

import java.util.Date;

/**
 * 版权声明：Copyright(c) 2018
 *
 * @program: ThreadTest
 * @Author minmin.liu
 * @Date 2018-11-30 10:56
 * @Version 1.0
 * @Description 类内调用方法测试
 */
public class InClassCallMethod {
    private void A(){
        System.out.println("hello a");
    }
    private void B(){
        A();
        System.out.println("this is B!");
    }

    public static void main(String[] args) {
        InClassCallMethod inClassCallMethod=new InClassCallMethod();
        inClassCallMethod.B();
        Date date =new Date();
        System.out.println(date);
        ///jkjkljkljkljkljkljl
    }
}
