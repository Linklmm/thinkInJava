package com.concurrent;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: linklmm
 * @Date: 2019/7/19 14:28
 * @Description:用ConcurrentHashMap替换HashMap，
 * 但是有可能导致计算得到相同的值
 */
public class Memoizer2<A,V> implements Computable<A,V>{
    private final Map<A,V> cache = new ConcurrentHashMap<A, V>();
    private final Computable<A,V> c;

    public Memoizer2(Computable<A, V> c) {
        this.c = c;
    }

    @Override
    public V compute(A arg) throws InterruptedException {
        V result = cache.get(arg);
        if (result == null){
            result = c.compute(arg);
            cache.put(arg,result);
        }
        return result;
    }
}
