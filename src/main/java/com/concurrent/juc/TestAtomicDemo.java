package com.concurrent.juc;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-24 08:02
 * @Version 1.0
 * @Description i++的原子性问题
 */
public class TestAtomicDemo {
    public static void main(String[] args) {
//        AtomicDemo ad = new AtomicDemo();
//
//        for (int i=0;i<10;i++){
//            new Thread(ad).start();
//        }
        System.out.println("===============");
        AtomicDemo2 ad2 = new AtomicDemo2();

        for (int i = 0; i < 10; i++) {
            new Thread(ad2).start();
        }
    }
}

class AtomicDemo implements Runnable {
    private volatile int serialNumber = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + ": " + getSerialNumber());
    }

    public int getSerialNumber() {
        return serialNumber++;
    }
}

class AtomicDemo2 implements Runnable {
    private AtomicInteger serialNumber = new AtomicInteger();

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + ": " + getSerialNumber());
    }

    public int getSerialNumber() {
        return serialNumber.getAndIncrement();
    }
}