package com.thread;

public class Sleeper extends Thread {
    private int duration;
    public Sleeper(String name,int sleepTime){
        super(name);
        duration=sleepTime;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName()+" was interrupted."+"isInterrupdated():"+isInterrupted());//isinterruptde（）的返回值报告这个中断
            return;
        }
        System.out.println(getName()+" has awakened");
    }
}
