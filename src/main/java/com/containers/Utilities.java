package com.containers;

import java.util.*;

/**
 * @author lmm
 * @Title: Utilities
 * @ProjectName thinkInJava
 * @Description: Collections的实用方法
 * @date 19-1-21下午5:09
 */
public class Utilities {
    static List<String> list = Arrays.asList(
            "one Two three Four five six one".split(" "));
    public static void main(String[] args){
        System.out.println(list);
        System.out.println("singletonList: "+Collections.singletonList("Four"));
        //singletonList 产生不可变的List
        //disjoint 当两个集合没有任何相同元素时，返回true
        System.out.println("'list' disjoint (Four)?: "+
                Collections.disjoint(list,Collections.singletonList("Four")));
        System.out.println("max: "+Collections.max(list));
        System.out.println("min: "+Collections.min(list));
        System.out.println("max w/ comparator: "+Collections.max(
                list,String.CASE_INSENSITIVE_ORDER));
        System.out.println("min w/ comparator: "+Collections.min(
                list,String.CASE_INSENSITIVE_ORDER));

        List<String> sublist = Arrays.asList("Four five six".split(" "));
        System.out.println("indexOfSubList: "+
                Collections.indexOfSubList(list,sublist));
        System.out.println("lastIndexOfSubList: "+
                Collections.lastIndexOfSubList(list,sublist));

        Collections.replaceAll(list,"one","Yo");
        System.out.println("replaceAll: "+list);
        //逆转所有元素的次序
        Collections.reverse(list);
        System.out.println("reverse: "+list);
        //list所有元素向后移动3个位置，将末尾元素循环到前面来
        Collections.rotate(list,3);
        System.out.println("rotate: "+list);
        List<String> source = Arrays.asList("in the matrix".split(" "));
        System.out.println("sourceList: "+source);
        Collections.copy(list,source);
        System.out.println("Copy: "+list);

        Collections.swap(list,0,list.size()-1);
        System.out.println("swap: "+list);
        //随机改变指定列表的顺序
        Collections.shuffle(list,new Random(47));
        System.out.println("shuffled: "+list);
        //用“pop"替换List中的所有元素
        Collections.fill(list,"pop");
        System.out.println("fill: "+list);
        //返回Collection中等于"pop"的元素
        System.out.println("frequency of 'pop': "+
                Collections.frequency(list,"pop"));
        //返回大小为3的List
        List<String> dups = Collections.nCopies(3,"snap");
        System.out.println("dups: "+dups);
        System.out.println("'list' disjoint 'dups'?: "+
                Collections.disjoint(list,dups));

        Enumeration<String> e = Collections.enumeration(dups);
        Vector<String> v =new Vector<String>();
        while (e.hasMoreElements()){
            v.addElement(e.nextElement());
        }
        System.out.println("v: "+v);
        ArrayList<String> arrayList = Collections.list(v.elements());
        System.out.println("arrayList: "+arrayList);
    }
}
