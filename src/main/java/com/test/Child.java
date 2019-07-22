package com.test;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-22 11:00
 * @Version 1.0
 * @Description
 */
public class Child extends Base {
    @Override
    public void test() {
        System.out.println("Child.test()");
    }

    static public void main(String[] a) {
        Child anObj = new Child();
        Base baseObj = (Base) anObj;
        baseObj.test();
    }
}
