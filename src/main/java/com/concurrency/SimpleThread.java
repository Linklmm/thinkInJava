package com.concurrency;

/**
 * @Auther: linklmm
 * @Date: 2019/7/4 14:42
 * @Description:通过继承Thread类来实现多线程
 *
 */
public class SimpleThread extends Thread {
    private int countDown =5;
    private static int threadCount =0;

    public SimpleThread() {
        super(Integer.toString(++threadCount));
        start();
    }

    @Override
    public String toString() {
        return "#"+getName()+"("+countDown+"),";
    }

    @Override
    public void run() {
        while (true){
            System.out.println(this);
            if (--countDown==0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            new SimpleThread();
        }
    }
}
