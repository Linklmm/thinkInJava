package com.concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * @Auther: linklmm
 * @Date: 2019/7/4 10:23
 * @Description:自己创建的线程池，创建的线程状态都为后台线程
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
