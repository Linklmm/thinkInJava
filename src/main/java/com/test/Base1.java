package com.test;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-21 08:38
 * @Version 1.0
 * @Description
 */
public class Base1 {
    public void methodOne(){
        System.out.println("A");
        methodTwo();
    }

    public void methodTwo() {
        System.out.println("B");
    }
}
