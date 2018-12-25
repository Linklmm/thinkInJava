package com.containers;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author lmm
 * @Title: Lists
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 18-12-25下午3:34
 */
public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    /**
     * 每个list可以执行的操作
     * @param a
     */
    public static void basicTest(List<String> a){
        a.add(1,"x");
        //在最后添加对象
        a.add("x");
    }
}
