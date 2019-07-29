package com.test;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-25 08:03
 * @Version 1.0
 * @Description 测试Java的值传递
 */
public class TestValue {
    public static void main(String[] args) {
        TestValue pt = new TestValue();

        String name = "Hollis";
        pt.pass(name);
        System.out.println("print in main , name is " + name);
    }

    public void pass(String name) {
        name = "hollischuang";
        System.out.println("print in pass , name is " + name);
    }
}
