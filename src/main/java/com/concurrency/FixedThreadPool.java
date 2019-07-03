package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: linklmm
 * @Date: 2019/7/3 14:40
 * @Description:
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i=0;i<5;i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
