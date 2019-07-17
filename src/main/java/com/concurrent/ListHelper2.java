package com.concurrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-17 11:25
 * @Version 1.0
 * @Description 线程安全的"若没有则添加"
 * 这个锁住的是list对象本身
 */
public class ListHelper2<E> {
    public List<E> list = Collections.synchronizedList(new ArrayList<E>());

    public synchronized boolean putIfAbsent(E x) {
        synchronized (list) {
            boolean absent = !list.contains(x);
            if (absent) {
                list.add(x);
            }
            return absent;
        }
    }
}
