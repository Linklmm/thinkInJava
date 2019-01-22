package com.containers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author lmm
 * @Title: FailFast
 * @ProjectName thinkInJava
 * @Description: 快速报错机制的工作原理
 * @date 19-1-22上午10:48
 */
public class FailFast {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        Iterator<String> it = c.iterator();
        c.add("An Object");

        try {
            String s = it.next();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
