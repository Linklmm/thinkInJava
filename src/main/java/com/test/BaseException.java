package com.test;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-22 09:05
 * @Version 1.0
 * @Description 业务异常
 */
public class BaseException extends Exception {
    public BaseException(String message) {
        super(message);
    }

    public BaseException() {
        super();
    }
}
