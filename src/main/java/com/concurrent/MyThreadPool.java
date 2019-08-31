package com.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-15 09:04
 * @Version 1.0
 * @Description 自定义线程池
 */
public class MyThreadPool {
    /**
     * 存放线程的集合
     */
    private ArrayList<Thread> threadList;
    /**
     * 默认线程池的大小
     */
    private static final Integer DEFAULT_THREAD_NUM = 10;
    /**
     * 任务队列
     */
    private ArrayBlockingQueue<Runnable> taskQueue;
    /**
     * 线程池初始限定大小
     */
    private int threadNum;
    /**
     * 已经工作的线程数目
     */
    private int workThreadnum;
    ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();

    private final ReentrantLock mainLock = new ReentrantLock();


    public MyThreadPool(int threadNum) {
        this.threadNum = threadNum;
        threadList = new ArrayList<>(threadNum);
        //任务队列初始化为线程池的四倍
        taskQueue = new ArrayBlockingQueue<>(threadNum * 4);
        workThreadnum = 0;
    }

    public MyThreadPool() {
        this(DEFAULT_THREAD_NUM);
    }

    public void execute(Runnable runnable) {
        try {
            mainLock.lock();
            //线程池未满，每加入一个任务则开启一个线程
            if (workThreadnum < threadNum) {
                MyThread myThread = new MyThread(runnable);
                myThread.start();
                threadList.add(myThread);
                workThreadnum++;
            }else {
                if (!taskQueue.offer(runnable)){
                    //队列已满，无法添加时，拒绝任务
                    rejectTask();
                }else {
                    //线程池已满，放入任务队列，等待有空闲线程时执行
                    taskQueue.add(runnable);
                }
            }
        } finally {
            mainLock.unlock();
        }
    }

    private void rejectTask() {
        System.out.println("任务队列已满，无法继续添加，请扩大您的初始化线程池！");
    }


    class MyThread extends Thread {
        private Runnable task;

        public MyThread(Runnable task) {
            this.task = task;
        }

        @Override
        public void run() {
            //该线程一直启动这，不断从队列中取出任务执行
            while (true) {
                //如果初始化任务不为空，则执行初始化任务
                if (task != null) {
                    task.run();
                    task = null;
                } else {
                    //否则去任务队列取任务并执行
                    Runnable queueTask = taskQueue.poll();
                    if (queueTask != null) {
                        queueTask.run();
                    }
                }
            }
        }
    }
}
