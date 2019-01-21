package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lmm
 * @Title: ListTest
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 19-1-17下午4:41
 */
public class ListTest {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list.addAll(list1);
        System.out.println(list);
    }
}
