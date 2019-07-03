package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: linklmm
 * @Date: 2019/7/3 15:39
 * @Description:
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService exec =
                Executors.newSingleThreadExecutor();
        for (int i =0;i<5;i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
