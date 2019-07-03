package com.concurrency;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Auther: linklmm
 * @Date: 2019/7/3 16:00
 * @Description: Callable是一种具有类型参数的泛型，任务完成时可以返回一个返回值
 * 实现是通过call()方法
 */
class TaskWithResult implements Callable<String>{
    private int id ;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult "+id;
    }
}
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i=0;i<10;i++){
            results.add(exec.submit(new TaskWithResult(i)));
        }
        for (Future<String> fs : results){
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                exec.shutdown();
            }
        }
    }
}
