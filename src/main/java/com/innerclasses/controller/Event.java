package com.innerclasses.controller;

/**
 * @Auther: linklmm
 * @Date: 2019/7/1 17:43
 * @Description:
 */
public abstract class Event {
    private long evenTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        evenTime = System.nanoTime() + delayTime;
        System.out.println("evenTime = "+evenTime);
    }

    public boolean ready() {
        return System.nanoTime() >= evenTime;
    }

    public abstract void action();
}
