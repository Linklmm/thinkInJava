package com.generics;
/**
 *
 * 记录创建多少个CountedObject实例
 * */
public class CountedObject {
    private static long counter=0;
    private final long id=counter++;
    public long id(){return id;}
    public String toString(){
        return "CounterObject "+id;
    }
}
