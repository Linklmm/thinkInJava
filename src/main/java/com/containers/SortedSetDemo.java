package com.containers;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author lmm
 * @Title: SortedSetDemo
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 18-12-25下午6:05
 */
public class SortedSetDemo {
    public static void main(String[] args){
        SortedSet<String> sortedSet=new TreeSet<String>();
        Collections.addAll(sortedSet,"one two three four five six seven eight".split(" "));
        System.out.println(sortedSet);
        String low = sortedSet.first();
        String high = sortedSet.last();
        System.out.println(low);
        System.out.println(high);
        Iterator<String> iterator =sortedSet.iterator();
        for (int i=0;i<=6;i++){
            if (i == 3 )
                low = iterator.next();
            if(i == 6 )
                high = iterator.next();
            else
                iterator.next();
        }
        System.out.println(low);
        System.out.println(high);
        System.out.println(((TreeSet<String>) sortedSet).subSet(low,high));
        System.out.println(((TreeSet<String>) sortedSet).headSet(high));
        System.out.println(((TreeSet<String>) sortedSet).tailSet(low));
    }
}
