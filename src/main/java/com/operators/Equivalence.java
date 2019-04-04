package com.operators;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author minmin.liu(minmin.liu @ ucarinc.com)
 * @Date 2019-04-04 11:17
 * @Version 1.0
 * @Description 测试对象的等价性
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer a = new Integer(47);
        Integer b = new Integer(47);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a.equals(b));
    }
}
