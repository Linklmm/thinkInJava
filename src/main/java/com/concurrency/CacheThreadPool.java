package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: linklmm
 * @Date: 2019/7/3 11:43
 * @Description:使用Executors管理线程
 */
public class CacheThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i =0;i<5;i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
