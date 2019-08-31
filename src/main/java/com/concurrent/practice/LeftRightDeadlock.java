package com.concurrent.practice;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-28 08:30
 * @Version 1.0
 * @Description 简单的锁顺序死锁
 * 容易发生死锁
 */
public class LeftRightDeadlock {
    private final Object left = new Object();
    private final Object right = new Object();

    public synchronized void left(){
        synchronized (left){
            synchronized (right){

            }
        }
    }

    public synchronized void right(){
        synchronized (right){
            synchronized (left){

            }
        }
    }
}
