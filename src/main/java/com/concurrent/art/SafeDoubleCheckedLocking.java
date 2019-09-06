package com.concurrent.art;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-09-06 11:33
 * @Version 1.0
 * @Description 线程安全的双重检查锁定
 */
public class SafeDoubleCheckedLocking {
    private static volatile Counter counter;
    public static  Counter getCounter(){
        if (counter == null){
            synchronized (SafeDoubleCheckedLocking.class){
                if (counter == null) {
                    counter = new Counter();
                }
            }
        }
        return counter;
    }
}
