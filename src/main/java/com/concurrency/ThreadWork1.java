package com.concurrency;

/**
 * @Auther: linklmm
 * @Date: 2019/7/3 15:44
 * @Description:
 */
public class ThreadWork1 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            Thread t = new Thread(new Work1("work is constructor!"));
            t.start();
        }
    }
}
