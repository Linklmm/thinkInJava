package com.concurrent.practice;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-09-02 10:51
 * @Version 1.0
 * @Description 使用简单阻塞实现的有界缓存
 */
public class SleepyBoundedBuffer<V> extends BaseBoundedBuffer<V> {
    public SleepyBoundedBuffer(int capacity) {
        super(capacity);
    }

    public void put(V v) throws InterruptedException {
        while (true){
            synchronized (this){
                if (!isFull()){
                    doPut(v);
                    return;
                }
            }
            Thread.sleep(1000);
        }
    }

    public V take() throws InterruptedException {
        while (true){
            synchronized (this){
                if (!isEmpty()){
                    return doTake();
                }
            }
            Thread.sleep(1000);
        }
    }

}
