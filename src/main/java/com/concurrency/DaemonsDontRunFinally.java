package com.concurrency;

import java.util.concurrent.TimeUnit;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/7/4 11:39
 * @Description:
 */
class ADaemon implements Runnable{
    @Override
    public void run() {
        try {
            print("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            print("Exiting via InterruptedException");
        }finally {
            print("This should always run?");
        }
    }
}
public class DaemonsDontRunFinally {
    public static void main(String[] args) {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
    }
}
