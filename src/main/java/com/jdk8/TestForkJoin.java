package com.jdk8;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-22 09:17
 * @Version 1.0
 * @Description 测试ForkJoin
 */
public class TestForkJoin {
    @Test
    public void test1() {
        Instant start = Instant.now();

        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinCalculate(0L, 100000000L);
        Long sum = pool.invoke(task);
        System.out.println(sum);

        Instant end = Instant.now();
        System.out.println("消耗时间为：" + Duration.between(start, end).toMillis());
    }

    /**
     * 并行流
     */
    @Test
    public void test3(){
        Instant start = Instant.now();
        LongStream.rangeClosed(0,1000000000L)
                .parallel()
                .reduce(0,Long::sum);

        Instant end = Instant.now();
        System.out.println("消耗时间为：" + Duration.between(start, end).toMillis());
    }
}
