package com.concurrency;

import java.util.concurrent.TimeUnit;

import static com.util.Print.print;
import static com.util.Print.printb;

/**
 * @Auther: linklmm
 * @Date: 2019/7/4 11:20
 * @Description:
 */
class Daemon implements Runnable{
    private Thread[] t = new Thread[10];
    @Override
    public void run() {
        for (int i=0;i<t.length;i++){
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            printb("DaemonSpawn "+i+" started. ");
        }
        for (int i=0;i<t.length;i++){
            printb("t["+i+"].isDaemon() = "+
            t[i].isDaemon()+". ");
        }
        while (true){
            Thread.yield();
        }
    }
}
class DaemonSpawn implements Runnable{
    @Override
    public void run() {
        while (true){
            Thread.yield();
        }
    }
}
public class Daemons {
    public static void main(String[] args) throws InterruptedException {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        print("d.isDaemon() = "+d.isDaemon()+".");
        TimeUnit.SECONDS.sleep(1);
    }
}
