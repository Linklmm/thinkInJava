package com.concurrency;

/**
 * @Auther: linklmm
 * @Date: 2019/7/3 09:44
 * @Description:
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i =0;i<5;i++){
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
