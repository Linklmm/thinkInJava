package com.concurrent;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-24 09:14
 * @Version 1.0
 * @Description 使用volatile类型的域来保存取消状态
 */
public class PrimeGenerator implements Runnable {
    private final List<BigInteger> primes = new ArrayList<BigInteger>();
    private volatile boolean cancelled;

    @Override
    public void run() {
        BigInteger p = BigInteger.ONE;
        while (!cancelled){
            p = p.nextProbablePrime();
            synchronized (this){
                primes.add(p);
            }
        }
    }

    public void cancel(){
        cancelled = true;
    }

    public synchronized List<BigInteger> get(){
        //保护性拷贝
        return new ArrayList<BigInteger>(primes);
    }

    /**
     * 一个仅运行一秒钟的素数生成器
     * @return
     */
    List<BigInteger> aSecondOfPrimes(){
        PrimeGenerator generator = new PrimeGenerator();
        new Thread(generator).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            generator.cancel();
        }
        return generator.get();
    }
}
