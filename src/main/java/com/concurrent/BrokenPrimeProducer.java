package com.concurrent;

import java.math.BigInteger;
import java.util.concurrent.BlockingQueue;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-24 09:32
 * @Version 1.0
 * @Description 不可靠的取消操作将把生产者置于阻塞的操作中（不要这么做）
 */
public class BrokenPrimeProducer extends Thread {
    private final BlockingQueue<BigInteger> queue;
    private volatile boolean cancelled = false;

    BrokenPrimeProducer(BlockingQueue<BigInteger> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            BigInteger p = BigInteger.ONE;
            while (!cancelled){
                queue.put(p = p.nextProbablePrime());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cancel(){
        cancelled = true;
    }
    void consumePrimes(){}
}
