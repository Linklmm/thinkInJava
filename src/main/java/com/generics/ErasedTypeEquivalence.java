package com.generics;

import java.util.ArrayList;
/**
 * @author linklmm
 * 程序会认为他们是相同类型
 * */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class cl=new ArrayList<String>().getClass();
        Class c2=new ArrayList<Integer>().getClass();
        System.out.println(cl==c2);
    }
}
