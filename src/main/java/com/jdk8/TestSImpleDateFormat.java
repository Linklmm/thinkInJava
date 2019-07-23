package com.jdk8;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-22 20:25
 * @Version 1.0
 * @Description 测试SimpleDateFormat的线程安全
 */
public class TestSImpleDateFormat {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        Callable<Date> task = new Callable<Date>() {
            @Override
            public Date call() throws Exception {
                return sdf.parse("20161218");
            }
        };
        execService(task);

    }

    /**
     *
     * @param task
     * @throws ExecutionException
     * @throws InterruptedException
     */
    private static void execService(Callable<Date> task) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(10);

        List<Future<Date>> results = new ArrayList<>();
        for (int i=0;i<10;i++){
            results.add(pool.submit(task));
        }

        for (Future<Date> future:results){
            System.out.println(future.get());
        }
        pool.shutdown();
    }

    /**
     * 解决simpleDateFormat的并发问题
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    public void test() throws ExecutionException, InterruptedException {
        Callable<Date> task = new Callable<Date>() {
            @Override
            public Date call() throws Exception {
                return DateFormatThreadLocal.convert("20161218");
            }
        };

        execService(task);
    }

    /**
     * 使用JDK8解决时间格式化的问题
     */
    @Test
    public void test2() throws ExecutionException, InterruptedException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        Callable<LocalDate> task = new Callable<LocalDate>() {
            @Override
            public LocalDate call() throws Exception {
                return LocalDate.parse("20161218",dtf);
            }
        };

        ExecutorService pool = Executors.newFixedThreadPool(10);
        List<Future<LocalDate>> results = new ArrayList<>();
        for (int i=0;i<10;i++){
            results.add(pool.submit(task));
        }

        for (Future<LocalDate> future:results){
            System.out.println(future.get());
        }
        pool.shutdown();
    }
}
