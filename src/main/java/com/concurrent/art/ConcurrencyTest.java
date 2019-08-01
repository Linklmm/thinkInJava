package com.concurrent.art;

import java.time.Duration;
import java.time.Instant;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-30 10:34
 * @Version 1.0
 * @Description
 */
public class ConcurrencyTest {
    private static final long count = 100001;

    public static void main(String[] args) throws InterruptedException {
        concurrency();
    }

    private static void concurrency() throws InterruptedException {
        Instant start = Instant.now();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });
        thread.start();
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        thread.join();
        Instant end = Instant.now();
        System.out.println("concurrency :"+ Duration.between(start,end) +"ms,b=" + b);
    }
}
