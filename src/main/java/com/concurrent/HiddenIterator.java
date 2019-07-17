package com.concurrent;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-17 16:05
 * @Version 1.0
 * @Description 隐藏在字符串连接中的迭代操作
 */
public class HiddenIterator {
    private final Set<Integer> set = new HashSet<Integer>();

    public synchronized void add(Integer i) {
        set.add(i);
    }

    public synchronized void remove(Integer i) {
        set.remove(i);
    }

    public void addTenThings() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            add(r.nextInt());
        }
        //toString()方法会对容器进行迭代
        System.out.println("DEBUG: added ten elements to " + set);
    }
}
