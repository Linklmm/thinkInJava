package com.thread;

import java.util.concurrent.TimeUnit;

public class Daemons {
    public static void main(String[] args) throws InterruptedException {
        Thread d=new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.println("d.isDaemon()="+d.isDaemon()+".");
        TimeUnit.SECONDS.sleep(1);
    }
}
