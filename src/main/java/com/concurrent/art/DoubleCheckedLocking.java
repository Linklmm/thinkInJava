package com.concurrent.art;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-09-06 11:22
 * @Version 1.0
 * @Description 双重检查锁定
 */
public class DoubleCheckedLocking {
    private static Counter counter;
    public Counter getCounter(){
        //第一次检查
        if (counter == null){
            synchronized (DoubleCheckedLocking.class){
                //第二次检查
                if (counter == null){
                    //问题根源
                    counter = new Counter();
                }
            }
        }
        return counter;
    }
}
