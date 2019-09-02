package com.concurrent.practice;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-09-02 09:43
 * @Version 1.0
 * @Description 当不满足前提条件时，有界缓存不会执行相应的操作
 */
public class GrumpyBoundedBuffer<V> extends BaseBoundedBuffer<V> {
    public GrumpyBoundedBuffer(int size) {
        super(size);
    }

    public synchronized void  put(V v) throws Exception {
        if (isFull()){
            throw new Exception("BufferFullException");
        }
    }
    public synchronized V take() throws Exception {
        if (isEmpty()){
            throw new Exception("BufferFullException");
        }
        return doTake();
    }
}
