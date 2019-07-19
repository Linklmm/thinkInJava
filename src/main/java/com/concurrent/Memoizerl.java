package com.concurrent;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: linklmm
 * @Date: 2019/7/19 09:59
 * @Description:
 */
public class Memoizerl<A,V> implements Computable<A,V>{
    private final Map<A,V> cache = new HashMap<A,V>();
    private final Computable<A,V> c;
    public Memoizerl(Computable<A,V> c) {
        this.c = c;
    }
    @Override
    public synchronized V compute(A arg) throws InterruptedException {
        V result = cache.get(arg);
        if (result == null){
            result = c.compute(arg);
            cache.put(arg,result);
        }
        return result;
    }
}
