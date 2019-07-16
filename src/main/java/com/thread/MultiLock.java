package com.thread;

import static com.util.Print.print;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-16 16:13
 * @Version 1.0
 * @Description 被互斥所阻塞
 */
public class MultiLock {
    public synchronized void f1(int count){
        if (count-->0){
            print("f1() calling f2() with count "+count);
            f2(count);
        }
    }

    public synchronized void f2(int count){
        if (count-- > 0){
            print("f2() calling f1() with count "+count);
            f1(count);
        }
    }

    public static void main(String[] args) {
        final MultiLock multiLock = new MultiLock();
        new Thread(){
            @Override
            public void run() {
                multiLock.f1(10);
            }
        }.start();
    }
}
