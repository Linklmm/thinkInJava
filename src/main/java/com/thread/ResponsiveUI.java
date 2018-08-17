package com.thread;

import java.io.IOException;

public class ResponsiveUI extends Thread {
    private static volatile double d=1;
    public ResponsiveUI(){
        setDaemon(true);//线程启动之前调用该方法，可以把它设置为后台程序
        start();
    }

    @Override
    public void run() {
        while (true){
            d=d+(Math.PI+Math.E)/d;
        }
    }

    public static void main(String[] args) throws Exception {
        //new UnresponsiveUI();
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}
