package com.operators;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author
 * @Date 2019-05-08 15:22
 * @Version 1.0
 * @Description 窄化转换
 */
public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int) above " + (int) above);
        System.out.println("(int) below " + (int) below);
        System.out.println("(int) fabove " + (int) fabove);
        System.out.println("(int) fbelow " + (int) fbelow);
    }
}
