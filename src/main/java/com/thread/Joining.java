package com.thread;

/**
 * Grumpy was interrupted.isInterrupdated():false
 * Doc join completed
 * Sleepy has awakened
 * Dopey join completed
 */
public class Joining {
    public static void main(String[] args) {
        Sleeper
                sleepy=new Sleeper("Sleepy",1500),
        grumpy=new Sleeper("Grumpy",1500);
        Joiner
                dopey=new Joiner("Dopey",sleepy),
                doc=new Joiner("Doc",grumpy);
//        sleepy.interrupt();
        grumpy.interrupt();//调用interrupt()是，将给该线程设定一个标志，表明该线程已经被中断
    }
}
