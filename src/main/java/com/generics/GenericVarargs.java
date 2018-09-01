package com.generics;

import java.util.ArrayList;
import java.util.List;
/**
 * @author myfloweryourgrass
 * @create 2018/9/1
 * 泛型方法与可变参数能够很好的共存
 * 与java.util.arrays.asList()方法相同的功能
 *
 * */
public class GenericVarargs {
    public static <T>List<T> makeList(T... args){
        List<T> result=new ArrayList<T>();
        for (T item:args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls=makeList("A");
        System.out.println(ls);
        ls=makeList("A","B","C");
        System.out.println(ls);
        ls=makeList("ABCDEFGHIZKLMN".split(""));
        System.out.println(ls);
    }
}
