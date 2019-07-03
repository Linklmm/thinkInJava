package com.concurrency;

/**
 * @Auther: linklmm
 * @Date: 2019/7/3 09:36
 * @Description:Thread类
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waitting for liftoff");
    }
}
