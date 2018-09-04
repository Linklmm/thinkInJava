package com.generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards1 {
    static List list1;
    static List list2;
    static List<? extends Object> list3;
    static void assign1(List list){
        list1=list;
        list2=list;
        list3=list;
        //1.5会报警告：Warning:unchecked conversion Found:list,Required:List<?extends object>
    }
    static void assign2(List<?> list){
        list1=list;
        list2=list;
        list3=list;
    }
    static void assign3(List<? extends Object> list){
        list1=list;
        list2=list;
        list3=list;
    }

    public static void main(String[] args) {
        assign1(new ArrayList());
        assign2(new ArrayList());
        //assign3(new ArrayList());
        assign1(new ArrayList<String>());
        assign2(new ArrayList<String>());
        assign2(new ArrayList<String>());

        List<?> wildList=new ArrayList();
        assign1(wildList);
        assign2(wildList);
        assign3(wildList);
    }
}
