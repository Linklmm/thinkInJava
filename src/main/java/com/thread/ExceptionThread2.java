package com.thread;

public class ExceptionThread2 implements Runnable {
    @Override
    public void run() {
        //获得该驱动任务的Thread对象的引用
        Thread t=Thread.currentThread();
        System.out.println("run() by"+t);
        //会在线程因未捕获的异常而临近死亡时被调用
        System.out.println("eh="+t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}
