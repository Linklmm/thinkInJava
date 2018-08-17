package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();//cachedThreadpool将为每个任务都创建一个线程
        executorService.execute(new ExceptionThread());
    }
}
