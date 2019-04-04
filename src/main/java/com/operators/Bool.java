package com.operators;

import java.util.Random;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author minmin.liu(minmin.liu @ ucarinc.com)
 * @Date 2019-04-04 11:31
 * @Version 1.0
 * @Description 逻辑操作符
 */
public class Bool {
    public static void main(String[] args) {
        Random random = new Random(47);
        int i = random.nextInt(100);
        int j = random.nextInt(100);

        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("i>j is " + (i > j));
        System.out.println("i<j is " + (i < j));
        System.out.println("i>=j is " + (i >= j));
        System.out.println("i<=j is " + (i <= j));
        System.out.println("i==j is " + (i == j));
        System.out.println("i!=j is " + (i != j));
        System.out.println("(i<10)&&(j<10) is "
                + ((i < 10) && (j < 10)));
        System.out.println("(i<10)||(j<10) is "
                + ((i < 10) || (j < 10)));

//        System.out.println("i&&j is "+(i&&j));
    }
}
