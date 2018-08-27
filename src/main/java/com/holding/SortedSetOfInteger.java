package com.holding;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 * TreeSet将元素存储在红-黑树数据结构中，HashSet使用的是散列函数，LinkedHashList因为查询速度的原因也使用了散列，但是
 * 看起来它使用了链表来维护元素的插入顺序
 * @author myfloweryourgrass
 * */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random rand=new Random(47);
        SortedSet<Integer> intset=new TreeSet<Integer>();
        for (int i=0;i<10000;i++)
            intset.add(rand.nextInt(30));
        System.out.print(intset);
    }
}
