package com.thread;

import java.util.concurrent.TimeUnit;

public class ADeamon implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Starting ADeamon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.out.println("Exiting via InterruptedException");
        }finally {
            System.out.println("This should always run ?");
        }
    }
}
