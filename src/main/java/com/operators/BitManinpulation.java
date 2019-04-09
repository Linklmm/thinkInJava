package com.operators;

import java.util.Random;

/**
 * @Auther: linklmm
 * @Date: 2019/4/9 17:04
 * @Description 按位操作
 */
public class BitManinpulation {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();
        System.out.println("-1:" + Integer.toBinaryString(-1));
        System.out.println("+1:" + Integer.toBinaryString(+1));
        int maxpos = 2147483647;
        System.out.println("maxops:" + maxpos);

        int maxneg = -2147483648;
        System.out.println("maxneg:" + maxneg);

        System.out.println("i: " + Integer.toBinaryString(i));
        System.out.println("~i: " + Integer.toBinaryString(~i));
        System.out.println("-i: " + Integer.toBinaryString(-i));
        System.out.println("j: " + Integer.toBinaryString(j));

        System.out.println("i&j: " + (i & j));
        System.out.println("i|j: " + (i | j));
    }
}
