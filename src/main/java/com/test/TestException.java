package com.test;

import java.util.concurrent.Executors;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-22 09:03
 * @Version 1.0
 * @Description 测试Exception
 */
public class TestException {
    private void tException() throws BaseException {
        System.out.println("TestException before");
        throw new BaseException();
//        System.out.println("testExeception after");
    }

    public static void main(String[] args) {
        TestException t = new TestException();
        Executors.newSingleThreadExecutor();
        System.out.println(t==null);
    }
}
