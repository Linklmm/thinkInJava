package com.concurrent.juc;

import com.jdk8.ForkJoinCalculate;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-01 15:25
 * @Version 1.0
 * @Description Fork-Join框架
 */
public class TestForkJoinPool {

    public static void main(String[] args) {
        Instant start = Instant.now();
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinCalculate(0L,10000000000L);

        long sum = pool.invoke(task);

        System.out.println(sum);
        Instant end = Instant.now();
        System.out.println("耗时："+ Duration.between(start,end).toMillis());
    }

    @Test
    public void test1(){
        Instant start = Instant.now();
        long sum =0L;
        for (long i=0;i<=10000000000L;i++){
            sum+=i;
        }
        System.out.println(sum);

        Instant end = Instant.now();
        System.out.println("耗时："+ Duration.between(start,end).toMillis());
    }

    @Test
    public void test2(){
        Long sum = LongStream.rangeClosed(0L,500000000)
                .parallel().reduce(0L,Long::sum);
        System.out.println(sum);
    }
}
class ForkJoinSumCalculate extends RecursiveTask<Long>{

    private long start;
    private long end;

    //临界值
    private static final long THURSHOLD = 10000L;


    public ForkJoinSumCalculate(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long length = end -start;
        if (length <= THURSHOLD){
            long sum = 0L;
            for (long i = start;i<=end;i++){
                sum += i;
            }
            return sum;
        }else {
            long middle = (start+end)/2;

            ForkJoinSumCalculate left = new ForkJoinSumCalculate(start,middle);
            left.fork();//进行拆分，同时压入线程队列

            ForkJoinSumCalculate right = new ForkJoinSumCalculate(middle+1,end);
            right.fork();

            return left.join()+right.join();
        }
    }
}