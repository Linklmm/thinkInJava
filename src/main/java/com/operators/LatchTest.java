package com.operators;

import java.util.concurrent.CountDownLatch;

/**
 * @Auther: linklmm
 * @Date: 2019/4/12 09:46
 * @Description java模拟并发请求
 */
public class LatchTest {
    public static void main(String[] args) throws InterruptedException {
        Runnable taskTemp = new Runnable() {
            //非线程安全
            private int iCounter;

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    //todo:发起请求

                    iCounter++;
                    System.out.println(System.nanoTime() + "[" + Thread.currentThread().getName() + "] iCounter = " + iCounter);

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        LatchTest latchTest = new LatchTest();
        latchTest.startTaskAllInOnce(5, taskTemp);

    }

    public long startTaskAllInOnce(int threadNums, final Runnable task) throws InterruptedException {
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(threadNums);

        for (int i = 0; i < threadNums; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    //使线程在此等待，当开始门打开时，一起涌入门中
                    try {
                        startGate.await();

                        try {
                            task.run();
                        } finally {
                            //将结束门减1，减到0是，就可以开启结束门了
                            endGate.countDown();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            t.start();
        }

        long startTime = System.nanoTime();
        System.out.println(startTime + "[" + Thread.currentThread() + "] All thread is ready, concurrent going ...");
        //因开启门需要一个开关，所以立马就开启开始门
        startGate.countDown();

        //等待结束门开启
        endGate.await();

        Long endTime = System.nanoTime();
        System.out.println(endTime + "[" + Thread.currentThread() + "] All thread is completed.");
        return endTime - startTime;
    }
}
