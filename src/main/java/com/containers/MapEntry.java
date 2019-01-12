package com.containers;

import java.util.Map;

/**
 * @author lmm
 * @Title: MapEntry
 * @ProjectName thinkInJava
 * @Description: 可以保存和读取键和值
 * @date 19-1-11上午9:50
 */
public class MapEntry<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V result = value;
        this.value = value;
        return result;
    }

    @Override
    public int hashCode() {
        return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof MapEntry)) {
            return false;
        }
        MapEntry me = (MapEntry) obj;
        return
                (key == null ? me.getKey() == null : key.equals(me.getKey())) &&
                        (value == null ? me.getValue() == null : value.equals(me.getValue()));
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }
}
