package com.containers;

import java.util.AbstractList;

/**
 * @author lmm
 * @Title: CountingIntegerList
 * @ProjectName thinkInJava
 * @Description: 必须实现get和size方法，当你寻找值时，get方法将产生它
 * @date 18-12-25上午10:16
 */
public class CountingIntegerList extends AbstractList<Integer> {
    private int size;
    public CountingIntegerList(int size) {
        this.size=size<0?0:size;
    }

    @Override
    public Integer get(int index) {
        return Integer.valueOf(index);
    }

    @Override
    public int size() {
        return size;
    }
    public static void main(String[] args){
    System.out.println(new CountingIntegerList(30));
    }
}
