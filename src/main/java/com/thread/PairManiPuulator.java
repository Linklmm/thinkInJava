package com.thread;

public class PairManiPuulator implements Runnable {
    private PairManager pm;
    public PairManiPuulator(PairManager pm){
        this.pm=pm;
    }

    @Override
    public void run() {
        while (true)
            pm.increment();
    }

    @Override
    public String toString() {
        return "Pair:"+pm.getPair()+"checkCounter = "+pm.checkCounter.get();
    }
}
