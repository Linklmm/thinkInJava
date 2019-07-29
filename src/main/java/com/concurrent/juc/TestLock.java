package com.concurrent.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-24 20:04
 * @Version 1.0
 * @Description 同步锁Lock，是一个显示锁，需要通过lock（）方法上锁，必须通过unlock（）方法解锁
 */
public class TestLock {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket,"1号窗口").start();
        new Thread(ticket,"2号窗口").start();
        new Thread(ticket,"3号窗口").start();
    }
}
class Ticket implements Runnable{
    private int tick = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        try {
            while (true){
                if (tick > 0){
                    lock.lock();
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"完成售票，余票为："+--tick);
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
