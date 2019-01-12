package com.containers;

import java.util.*;

/**
 * @author lmm
 * @Title: SimpleHashMap
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 19-1-11上午10:13
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
    static final int SIZE = 997;
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];
    @Override
    public V put(K key, V value) {
        V oldValue = null;
        //abs函数返回参数的绝对值
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<MapEntry<K, V>>();
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        //创建传进来的mapEntry
        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()) {
            MapEntry<K, V> ipair = it.next();
            //如果传进来的key已存在那么
            if (ipair.getKey().equals(key)) {
                oldValue = ipair.getValue();
                //将旧值换成新值
                it.set(pair);
                found = true;
                break;
            }
        }
        if (!found) {
            buckets[index].add(pair);
        }
        return oldValue;

    }

    @Override
    public V get(Object key){
        int index = Math.abs(key.hashCode())%SIZE;
        if (buckets[index] == null){
            return null;
        }
        for (MapEntry<K,V> ipair : buckets[index]) {
            if (ipair.getKey().equals(key)){
                return ipair.getValue();
            }
        }
        return null;
    }
    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K,V>> set = new HashSet<Entry<K, V>>();
        for (LinkedList<MapEntry<K,V>> bucket : buckets){
            if (bucket == null){
                continue;}
            for (MapEntry<K,V> mpair : bucket){
                set.add(mpair);
            }
        }
        return set;
    }

}
