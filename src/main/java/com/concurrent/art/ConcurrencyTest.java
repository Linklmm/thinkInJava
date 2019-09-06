package com.concurrent.art;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

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
        serial();
        String s = "jjkjk";
        StringBuilder sb = new StringBuilder("jjkjk");
        System.out.println(s.equals(sb));
    }

    /**
     * 并发执行
     *
     * @throws InterruptedException
     */
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
        System.out.println("concurrency :" + Duration.between(start, end) + "ms,b=" + b);
    }

    private static void serial() {
        Instant start = Instant.now();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        Instant end = Instant.now();
        System.out.println("serial : " + Duration.between(start, end) + "ms,b = " + b);
    }
}
