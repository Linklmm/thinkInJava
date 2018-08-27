package com.holding;

import java.util.LinkedList;

/**
 * 栈
 * @author myfloweryourgrass
 * */
public class Stack<T> {
    private LinkedList<T> storage=new LinkedList<T>();
    public void push(T V){storage.addFirst(V);}
    public T peek(){return storage.getFirst();}
    public T pop(){return storage.removeFirst();}
    public boolean empty(){return storage.isEmpty();}
    @Override
    public String toString(){return storage.toString();}
}
