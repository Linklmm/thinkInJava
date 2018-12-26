package com.containers;

import java.util.LinkedList;

/**
 * @author lmm
 * @Title: Deque
 * @ProjectName thinkInJava
 * @Description: LinkedList中包含支持双向队列的方法，从LinkedList中暴露相关的方法
 * @date 18-12-26下午3:10
 */
public class Deque<T> {
    private LinkedList<T> deque = new LinkedList<T>();
    public void addFirst(T e){
        deque.addFirst(e);
    }
    public void addLast(T e){
        deque.addLast(e);
    }
    public T getFirst(){
        return deque.getFirst();
    }
    public T getLast(){
        return deque.getLast();
    }
    public T removeFirst(){
        return deque.removeFirst();
    }
    public T removeLast(){
        return deque.removeLast();
    }
    public int size(){
        return deque.size();
    }

    @Override
    public String toString() {
        return deque.toString();
    }
}
