package com.concurrency;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/7/4 15:08
 * @Description:通过使用内部类来将线程代码隐藏在类中
 */
class InnerThread1{
    private int countDown =5;
    private Inner inner;
    private class Inner extends Thread{
        Inner(String name){
            super(name);
            start();
        }

        @Override
        public void run() {
            try {
                while (true){
                    print(this);
                    if (--countDown == 0){
                        return;
                    }
                    sleep(10);
                }
            } catch (InterruptedException e) {
                print("interrupted");
            }
        }

        @Override
        public String toString() {
            return getName()+": "+countDown;
        }
    }
}
public class ThreadVariations {
}
