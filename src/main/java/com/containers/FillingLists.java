package com.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lmm
 * @Title: FillingLists
 * @ProjectName thinkInJava
 * @Description: 对单个对象的引用来填充Collection的方式
 * @date 18-12-24上午11:18
 */
class StringAddress{
    private String s;
    public StringAddress(String s){
        this.s=s;
    }

    @Override
    public String toString() {
        return super.toString()+" "+s;
    }
}
public class FillingLists {
    public static void main(String[] args){
        //Collection.nCopies()创建传递给构造器的List
        List<StringAddress> list = new ArrayList<StringAddress>(Collections.nCopies(4,new StringAddress("Hello")));
        System.out.println(list);
        Collections.fill(list,new StringAddress("World!"));
        System.out.println(list);
    }
}
