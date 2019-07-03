package com.concurrency;

/**
 * @Auther: linklmm
 * @Date: 2019/7/3 15:45
 * @Description:
 */
public class Work1 implements Runnable {
    private int countDown = 3;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public Work1(String s) {
        System.out.println(s);
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println("work1 is running #" + id + " (" +
                    (countDown > 0 ? countDown : "work1Off!") + "),");
            Thread.yield();
        }
    }
}
