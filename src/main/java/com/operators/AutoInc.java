package com.operators;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author minmin.liu(minmin.liu @ ucarinc.com)
 * @Date 2019-04-04 11:11
 * @Version 1.0
 * @Description 递增递减
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i: " + i);
        //i=i+1
        System.out.println("++i:" + ++i);
        //i=2;
        //i=i+1;
        System.out.println("i++:" + i++);
        System.out.println("i: " + i);
        System.out.println("--i:" + --i);
        System.out.println("i--:" + i--);
        System.out.println("i:" + i);
    }
}
