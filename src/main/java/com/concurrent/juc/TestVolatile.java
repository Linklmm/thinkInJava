package com.concurrent.juc;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-24 07:55
 * @Version 1.0
 * @Description 测试volatile
 * 注意：
 * 1、volatile 不具备"互斥性"
 * 2、volatile 不能保证变量的"原子性"
 */
public class TestVolatile {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        new Thread(td).start();

        while (true){
            if (true == td.flag){
                System.out.println("===================");
            }
        }
    }

}
class ThreadDemo implements Runnable{

    public volatile boolean flag = false;
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag: "+flag);
    }
}
