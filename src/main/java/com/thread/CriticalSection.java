package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CriticalSection {
    static void
    testApproaches(PairManager pman1,PairManager pman2){
        ExecutorService exec=Executors.newCachedThreadPool();
        PairManiPuulator
                pm1=new PairManiPuulator(pman1),
                pm2=new PairManiPuulator(pman2);
        PairChecker
                pcheck1=new PairChecker(pman1),
                pcheck2=new PairChecker(pman2);
        exec.execute(pm1);
        exec.execute(pm2);
        exec.execute(pcheck1);
        exec.execute(pcheck2);
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("sleep interrupted");
        }
        System.out.println("pm1:"+pm1+"\npm2:"+pm2);
        System.exit(0);
    }

    public static void main(String[] args) {
        PairManager
                pman1=new PairManager1(),
                pman2=new PairManager2();
        testApproaches(pman1,pman2);
    }
}
