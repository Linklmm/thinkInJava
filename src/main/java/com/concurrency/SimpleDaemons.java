package com.concurrency;

import java.util.concurrent.TimeUnit;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/7/4 09:58
 * @Description:
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                print(Thread.currentThread()+" "+this);
            }
        } catch (InterruptedException e) {
            print("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<10;i++){
            Thread daemon = new Thread(new SimpleDaemons());
//            将线程设置为后台线程
            daemon.setDaemon(true);
            daemon.start();
        }
        print("All daemons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
