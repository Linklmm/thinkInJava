package com.containers;

import java.util.*;

/**
 * @author lmm
 * @Title: SlowMap
 * @ProjectName thinkInJava
 * @Description: 使用一对ArrayList实现了一个map
 * @date 18-12-28下午3:47
 */
public class SlowMap<K,V> extends AbstractMap<K,V> {
    private List<K> keys = new ArrayList<K>();
    private List<V> values = new ArrayList<V>();
    @Override
    public V put(K key, V value){
        V oldValue =get(key);
        //判断key是否存在，不存在添加key和value，存在存入新value
        if (!keys.contains(key)){
            keys.add(key);
            values.add(value);
        }else {
            values.set(keys.indexOf(key),value);
        }
        return oldValue;
    }

    @Override
    //key是object
    public V get(Object key) {
        if (!keys.contains(key)){
            return null;
        }
        return values.get(keys.indexOf(key));
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K,V>> set =new HashSet<Entry<K, V>>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while (ki.hasNext()){
        }
        return set;
    }
}
