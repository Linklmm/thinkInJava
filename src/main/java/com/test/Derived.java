package com.test;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-21 08:37
 * @Version 1.0
 * @Description 牛哥网题目
 */
public class Derived extends Base1 {
    @Override
    public void methodOne() {
        super.methodOne();
        System.out.println("C");
    }

    @Override
    public void methodTwo() {
        super.methodTwo();
        System.out.println("D");
    }

    public static void main(String[] args) {
        Base1 b = new Derived();
        b.methodOne();
    }
}
