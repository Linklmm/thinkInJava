package com.thread.book;

/**
 * @Auther: linklmm
 * @Date: 2019/7/15 10:24
 * @Description:并发编程第三章：对象的共享 在没有同步的情况下共享变量
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (!ready)
                Thread.yield();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number =42;
        ready =true;
    }
}
