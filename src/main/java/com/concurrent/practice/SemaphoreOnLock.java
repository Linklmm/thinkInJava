package com.concurrent.practice;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-09-02 17:08
 * @Version 1.0
 * @Description 使用Lock来实现信号量
 */
public class SemaphoreOnLock {
    private final Lock lock = new ReentrantLock();

    private final Condition permitsAvailable = lock.newCondition();
    private int permits;

    SemaphoreOnLock(int initialPermits){
        lock.lock();
        try {
            permits = initialPermits;
        }finally {
            lock.unlock();
        }
    }

    public void acquire() throws InterruptedException {
        lock.lock();
        try {
            while (permits <= 0){
                permitsAvailable.await();
            }
            --permits;
        }finally {
            lock.unlock();
        }
    }
    public void release(){
        lock.lock();
        try {
            ++permits;
            permitsAvailable.signal();
        }finally {
            lock.unlock();
        }
    }
}
