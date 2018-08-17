package com.thread;

import java.util.Random;

public class Count {
    private int count=0;
    private Random rand=new Random(47);
    //如果将synchronized关键字去掉会整个报错
    public synchronized int increment(){
        int temp=count;
        if (rand.nextBoolean())
            Thread.yield();
        return (count=++temp);
    }
    public synchronized int value(){return count;}
}
