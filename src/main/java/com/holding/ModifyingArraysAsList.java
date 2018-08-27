package com.holding;

import java.util.*;

public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random rand=new Random(47);
        Integer[] ia={1,2,3,4,5,6,7,8,9,10};
        List<Integer> list1=new ArrayList<Integer>(Arrays.asList(ia));//创建一个引用ia的元素的ArrayList，因此打乱这些应用不会修改该数组
        System.out.println("Before shuffling: "+list1);
        Collections.shuffle(list1,rand);
        System.out.println("After shuffling: "+list1);
        System.out.println("array: "+Arrays.toString(ia));

        List<Integer> list2=Arrays.asList(ia);//直接使用Arrays.asList的结果，就会修改ia的顺序
        System.out.println("Before shuffling: "+list2);
        Collections.shuffle(list2,rand);
        System.out.println("After shuffling: "+list2);
        System.out.println("array: "+Arrays.toString(ia));
    }
}
