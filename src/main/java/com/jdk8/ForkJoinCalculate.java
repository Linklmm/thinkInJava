package com.jdk8;

import java.util.concurrent.RecursiveTask;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-22 09:06
 * @Version 1.0
 * @Description forkjoin框架
 */
public class ForkJoinCalculate extends RecursiveTask<Long> {
    private Long start;
    private Long end;
    private static final Long THRESHOLD = 10000L;

    public ForkJoinCalculate(Long start, Long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long length = start - end;
        if (length <= THRESHOLD) {
            Long sum = 0L;
            for (long i = start; i < end; i++) {
                sum += i;
            }
            return sum;
        } else {
            Long middle = (start + end) / 2;
            ForkJoinCalculate left = new ForkJoinCalculate(start, middle);
            left.fork();//拆分成子任务，同时压入线程队列

            ForkJoinCalculate right = new ForkJoinCalculate(middle + 1, end);
            right.fork();

            return left.join() + right.join();
        }
    }
}
