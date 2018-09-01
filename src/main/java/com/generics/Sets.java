package com.generics;

import java.util.HashSet;
import java.util.Set;
/**
 * set来表达数学中的表达式
 * @author myfloweryourgrass
 * */
public class Sets {
    //将两个参数合并在一起，即合集
    public static <T>Set<T> union(Set<T> a,Set<T> b){
        Set<T> result=new HashSet<T>(a);
        result.addAll(b);
        return result;
    }
    //set只包含两个参数共有的部分，即交集
    public static <T> Set<T> intersection(Set<T> a,Set<T> b){
        Set<T> result=new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }
    //从superset中移除subset包含的元素
    public static <T> Set<T> difference(Set<T> superset,Set<T> subset){
        Set<T> result=new HashSet<T>(superset);
        result.removeAll(subset);
        return result;
    }
    //除了交集之外的所有元素
    public static <T> Set<T> complement(Set<T> a,Set<T> b){
        return difference(union(a,b),intersection(a,b));
    }
}
