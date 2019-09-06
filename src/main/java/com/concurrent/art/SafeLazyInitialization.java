package com.concurrent.art;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-09-06 10:17
 * @Version 1.0
 * @Description 线程安全的延迟初始化对象
 */
public class SafeLazyInitialization {
    private static Counter counter;

    public synchronized static Counter getCounter() {
        if (counter == null) {
            return counter = new Counter();
        }
        return counter;
    }
}
