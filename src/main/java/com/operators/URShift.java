package com.operators;

/**
 * @Auther: linklmm
 * @Date: 2019/4/9 16:54
 * @Description 移位操作
 */
public class URShift {
    public static void main(String[] args) {
        int i =-1;
        System.out.println(Integer.toBinaryString(i));

        i >>>=10;
        System.out.println(Integer.toBinaryString(i));

        long l =-1;
        System.out.println(Long.toBinaryString(l));
        l>>>=10;
        System.out.println(Long.toBinaryString(l));

        short s =-1;
        System.out.println(Integer.toBinaryString(s));
        s>>>=10;
        System.out.println(Integer.toBinaryString(s));

        byte b =-1;
        System.out.println(Integer.toBinaryString(b));
        b>>>=10;
        System.out.println(Integer.toBinaryString(b));
        b=-1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b>>>10));
    }
}
