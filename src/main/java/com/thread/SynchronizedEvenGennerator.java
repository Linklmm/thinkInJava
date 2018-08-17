package com.thread;

public class SynchronizedEvenGennerator extends IntGenerator {
    private int currentEvenValue=0;
    public synchronized int next(){
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGennerator());
    }
}
