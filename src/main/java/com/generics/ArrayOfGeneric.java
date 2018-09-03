package com.generics;

public class ArrayOfGeneric {
    static final int SIZE=100;
    static Generic<Integer>[] gia;
    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        gia=(Generic<Integer>[]) new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0]=new Generic<Integer>();
    }
}
