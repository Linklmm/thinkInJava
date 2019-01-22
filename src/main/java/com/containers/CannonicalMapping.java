package com.containers;

import java.util.WeakHashMap;

/**
 * @author lmm
 * @Title: CannonicalMapping
 * @ProjectName thinkInJava
 * @Description: WeakHashMap
 * @date 19-1-22上午11:25
 */
class Element {
    private String ident;

    public Element(String ident) {
        this.ident = ident;
    }

    @Override
    public String toString() {
        return ident;
    }

    @Override
    public int hashCode() {
        return ident.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Element &&
                ident.equals(((Element) obj).ident);
    }

    @Override
    protected void finalize() {
        System.out.println("Finalizing " +
                getClass().getSimpleName() + " " + ident);
    }
}

class Key extends Element {
    public Key(String ident) {
        super(ident);
    }
}

class Value extends Element {
    public Value(String ident) {
        super(ident);
    }
}

public class CannonicalMapping {
    public static void main(String[] args) {
        int size = 1000;
        if (args.length > 0) {
            size = new Integer(args[0]);
        }
        Key[] keys = new Key[size];
        WeakHashMap<Key, Value> map =
                new WeakHashMap<Key, Value>();
        for (int i = 0; i < size; i++) {
            Key k = new Key(Integer.toString(i));
            Value v = new Value(Integer.toString(i));
            if (i % 3 == 0) {
                keys[i] = k;
            }
            map.put(k, v);
        }
        System.gc();
    }
}
