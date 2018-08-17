package com.thread;

public class DaemonsDontRunFinally {
    public static void main(String[] args) throws Exception{
        Thread t=new Thread(new ADeamon());
        //t.setDaemon(true);
        t.start();
    }
}
