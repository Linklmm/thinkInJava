package com.containers;

/**
 * @author lmm
 * @Title: Pair
 * @ProjectName thinkInJava
 * @Description: 只读的数据传输对象
 * @date 18-12-24下午5:19
 */
public class Pair<K,V> {
    public final K key;
    public final V Value;
    public Pair(K k,V v){
        key = k;
        Value = v;
    }
}
