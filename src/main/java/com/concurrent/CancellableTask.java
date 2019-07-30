package com.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-29 08:54
 * @Version 1.0
 * @Description 通过newTaskFor将非标准的取消操作封装在一个任务中
 */
public interface CancellableTask<T> extends Callable<T> {
    void cancel();
    RunnableFuture<T> newTask();
}
