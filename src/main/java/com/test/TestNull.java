package com.test;


/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-16 10:07
 * @Version 1.0
 * @Description
 */
public class TestNull {
    private Integer sout(){
        System.out.println("Shu chu wei kong");
        return null;
    }

    private Integer two(){
        TestNull testNull = new TestNull();
        return testNull.sout();
    }
    public static void main(String[] args) {
        TestNull testNull = new TestNull();
        Integer count = testNull.two();
        if (count != null && count == 0) {
            System.out.println("ok");
        }

    }
}
