package com.concurrent;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-17 08:37
 * @Version 1.0
 * @Description 并发编程实战，使用Java监视器模式的线程安全计数器
 */
public class Counter {
    private long value =0;

    public synchronized long getValue() {
        return value;
    }
    public synchronized long increment(){
        if (value == Long.MAX_VALUE)
            throw new IllegalStateException("counter overflow");
        return ++value;
    }
}
