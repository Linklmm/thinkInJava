package com.concurrent.practice;

import java.util.Objects;
import java.util.concurrent.Semaphore;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-29 17:00
 * @Version 1.0
 * @Description 基于信号量的有界缓存
 * 使用Semaphore来实现缓存的有界属性和阻塞行为
 */
public class BoundedBuffer<E> {
    /**
     * availableItems 表示可以从缓存中删除的元素个数，初始值为0.
     * availableSpaces 表示可以插入到缓存的元素个数，初始值等于缓存的大小
     */
    private final Semaphore availableItems ,availableSpaces;
    private final E[] items;
    private int putPosition =0,takePosition = 0;

    public BoundedBuffer(int capacity) {
        availableItems = new Semaphore(0);
        availableSpaces = new Semaphore(capacity);
        items = (E[]) new Objects[capacity];
    }

    public boolean isEmpty(){
        return availableItems.availablePermits() == 0;
    }

    public boolean isFull(){
        return availableSpaces.availablePermits() == 0;
    }

    public void put(E x) throws InterruptedException {

        availableSpaces.acquire();
        doInsert(x);
        availableItems.release();
    }

    public E take() throws InterruptedException {
        //如果缓存不为空，那么这个请求会立即成功，否则请求将被阻塞直到缓存不为空。
        availableItems.acquire();
        E item = doExtract();
        availableSpaces.release();
        return item;
    }

    private synchronized void doInsert(E x){
        int i = putPosition;
        items[i] = x;
        putPosition = (++i == items.length)?0:i;
    }
    private synchronized E doExtract(){
        int i = takePosition;
        E x = items[i];
        items[i] = null;
        takePosition = (++i == items.length)?0:i;
        return x;
    }
}
