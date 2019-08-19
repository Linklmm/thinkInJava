//package com.concurrent.art;
//
//import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicLong;
//
///**
// * 版权声明：Copyright(c) 2019
// *
// * @program: thinkInJava
// * @Author myFlowerYourGrass
// * @Date 2019-08-15 15:32
// * @Version 1.0
// * @Description 线程池接口的默认实现
// */
//public class DefaultThreadPool<Job extends Runnable> implements ThreadPool<Job> {
//    //线程池最大限制数
//    private static final int MAX_WORKER_NUMBERS = 10;
//    //线程池的默认大小
//    private static final int DEFAULT_WORKER_NUMBERS = 5;
//    //线程池最小的数量
//    private static final int MIN_WORKER_NUMBERS = 1;
//    //    这是一个工作列表，将会向里面插入工作
//    private final LinkedList<Job> jobs = new LinkedList<>();
//    //工作者列表
//    private final List<Worker> workers = Collections.synchronizedList(new ArrayList<Worker>());
//    //工作者线程的数量
//    private int workerNum = DEFAULT_WORKER_NUMBERS;
//    //线程编号生成
//    private AtomicLong threadNum = new AtomicLong();
//
//
//    public DefaultThreadPool() {
//        initializeWorkers(DEFAULT_WORKER_NUMBERS);
//    }
//
//    public DefaultThreadPool(int num){
//        workerNum = num>MAX_WORKER_NUMBERS?MAX_WORKER_NUMBERS:num<MIN_WORKER_NUMBERS
//                ?MIN_WORKER_NUMBERS:num;
//        initializeWorkers(num);
//    }
//
//    /**
//     * 初始化线程工作者
//     */
//    private void initializeWorkers(int num){
//        for (int i=0;i<num;i++){
//            Worker worker = new Worker();
//            workers.add(worker);
//            Thread thread = new Thread(worker,"thread-worker-"+threadNum.incrementAndGet());
//            thread.start();
//        }
//    }
//    public void execute(Job job){
//        if (job!=null){
//            //添加一个工作，然后进行通知
//            synchronized (job){
//                jobs.addLast(job);
//                jobs.notify();
//            }
//        }
//    }
//
//    /**
//     * 工作者负责消费任务
//     */
//    class Worker implements Runnable {
//        //是否工作
//        private volatile boolean running = true;
//
//        @Override
//        public void run() {
//            while (running) {
//                Job job = null;
//                synchronized (jobs) {
//                    //如果工作者列表是空的，那么就wait
//                    while (jobs.isEmpty()) {
//                        try {
//                            jobs.wait();
//                        } catch (InterruptedException e) {
//                            //感知到外部对WorkerThread的中断操作，返回
//                            Thread.currentThread().interrupt();
//                            return;
//                        }
//                    }
//                    //取出一个Job
//                    job = jobs.removeFirst();
//                }
//                if (job != null) {
//                    try {
//                        job.run();
//                    } catch (Exception e) {
//                        //忽略job执行中的Exception
//
//                    }
//                }
//            }
//        }
//
//        public void shutdown() {
//            running = false;
//        }
//    }
//}
