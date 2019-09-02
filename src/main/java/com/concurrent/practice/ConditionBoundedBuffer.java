package com.concurrent.practice;

import org.omg.CORBA.Object;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-09-02 16:27
 * @Version 1.0
 * @Description 使用显式条件变量的有界缓存
 */
public class ConditionBoundedBuffer<T> {
    private static final int BUFFER_SIZE = 16;
    protected final Lock lock = new ReentrantLock();
    //条件谓词：notFull（Count<items.length)
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();
    private final T[] items = (T[]) new Object[BUFFER_SIZE];
    private int tail,head,count;

    /**
     * 阻塞并直到：notFull
     * @param x
     */
    public void put(T x) throws InterruptedException {
        lock.lock();
        try {
            while (count == items.length){
                notFull.await();
            }
            items[tail] = x;
            if (++tail == items.length){
                tail = 0;
            }
            ++count;
            notEmpty.signal();
        }finally {
            lock.unlock();
        }
    }
    public T take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0){
                notEmpty.await();
            }
            T x = items[head];
            items[head] = null;
            if (++head == items.length){
                head = 0;
            }
            --count;
            notFull.signal();
            return x;
        }finally {
            lock.unlock();
        }
    }
}
