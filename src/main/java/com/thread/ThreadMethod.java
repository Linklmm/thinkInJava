package com.thread;

public class ThreadMethod {
    private int countDown=5;
    private Thread t;
    private String name;
    public ThreadMethod(String name){this.name=name;}
    public void runTask(){
        if (t==null){
            t=new Thread(name){
                @Override
                public void run() {
                    try {
                        while (true){
                            System.out.println(this);
                            if (--countDown==0) return;
                            sleep(10);
                        }
                    } catch (InterruptedException e) {
                        System.out.println("sleep() interrupted");
                    }
                }
                @Override
                public String toString(){
                    return t.getName()+": "+countDown;
                }
            };
            t.start();
        }
    }
}
