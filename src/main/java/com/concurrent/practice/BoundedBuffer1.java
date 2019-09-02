package com.concurrent.practice;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-09-02 11:15
 * @Version 1.0
 * @Description 使用条件队列实现的有界缓存
 */
public class BoundedBuffer1<V> extends BaseBoundedBuffer<V> {
    public BoundedBuffer1(int capacity) {
        super(capacity);
    }
    public synchronized void put(V v) throws InterruptedException {
        while (isFull()){
            wait();
        }
        doPut(v);
        notifyAll();
    }

    public synchronized V take() throws InterruptedException {
        while (isEmpty()) {
            wait();
        }
        V v = doTake();
        notifyAll();
        return v;
    }
}
