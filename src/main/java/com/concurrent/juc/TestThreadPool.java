package com.concurrent.juc;

import java.util.concurrent.*;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-31 14:52
 * @Version 1.0
 * @Description 线程池：提供了一个线程队列，队列中保存着所有等待状态的线程。避免了创建于销毁额外开销，
 * 提供了响应速度。
 * 二、线程池的体系结构：
 * Java.util.concurrent.Executor ：负责线程的使用与调度的根接口
 *      ExecutorService 子接口：线程池的主要接口
 *          ThreadPoolExecutor 线程池实现类
 *          ScheduledExecutorService 子接口：负责线程的调度
 *              ScheduledThreadPoolExecutor： 继承了ThreadPoolExecutor，实现了ScheduledExecutorService
 * 三、工具类：Executors
 * ExecutorService newFixedThreadPool():创建固定大小的线程池
 * ExecutorService newCacheThreadPool（）：缓存线程池，线程池的数量不固定，可以根据需求自动的更改数量。
 * ExecutorService newSingleThreadExecutor（）：创建单个线程池。线程池中只有一个线程
 *
 * ScheduledExecutorService newScheduledThreadPool（）：创建固定大小的线程，可以延迟或定时的执行任务。
 */
public class TestThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程次
        ExecutorService pool = Executors.newFixedThreadPool(5);

        ThreadPoolDemo tpd = new ThreadPoolDemo();

        for (int i = 0; i < 10; i++) {
            //为线程池的线程分配任务
            pool.submit(tpd);
        }

        Future<Integer> future = pool.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0;i<100;i++){
                    sum+=i;
                }
                return sum;
            }
        });
        System.out.println(future.get());
        //3.关闭线程池
        pool.shutdown();
    }
}

class ThreadPoolDemo implements Runnable {
    private int i = 0;

    @Override
    public void run() {
        while (i <= 100) {
            System.out.println(Thread.currentThread().getName() + " : " + i++);
        }
    }
}