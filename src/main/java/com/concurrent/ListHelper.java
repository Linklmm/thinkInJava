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
 * @Description 非线程安全的"若没有则添加"
 * 这个putIfAbsent方法锁定的是该对象本身，而synchronizedList锁定的是list，
 * 这两个锁是不一样的，所以当进入putIfAbsent方法进行判断时，有可能有线程对list里的
 * 值进行了修改，导致putIfAbsent里的值失效。
 */
public class ListHelper<E> {
    public List<E> list = Collections.synchronizedList(new ArrayList<E>());

    public synchronized boolean putIfAbsent(E x){
        boolean absent = !list.contains(x);
        if (absent){
            list.add(x);
        }
        return absent;
    }
}
