package com.concurrent.art;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-09-06 10:08
 * @Version 1.0
 * @Description 双重检查锁定的由来
 * 非线程安全的延迟初始化对象
 */
public class UnsafeLazyInitialization {
    private static Counter counter;

    public static Counter getInstance(){
        if (counter==null){
            counter = new Counter();
            }
        return counter;
    }
}
