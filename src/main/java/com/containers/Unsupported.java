package com.containers;

import java.util.*;

/**
 * @author lmm
 * @Title: Unsupported
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 18-12-25下午3:12
 */
public class Unsupported {
    static void test(String msg, List<String> list){
        System.out.println("-----"+msg+"-------");
        Collection<String> c =list;
        Collection<String> subList=list.subList(1,8);
        Collection<String> c2 = new ArrayList<String>(subList);
        System.out.println("c2: "+c2);
        try {
            c.retainAll(c2);
        }catch (Exception e){
            System.out.println("retainAll(): "+e);
        }
        try {
            c.removeAll(c2);
        }catch (Exception e){
            System.out.println("removeAll(): "+e);
        }
        try {
            c.clear();
        }catch (Exception e){
            System.out.println("clear(): "+e);
        }
        try {
            ((List<String>) c).add("x");
        }catch (Exception e){
            System.out.println("add(): "+e);
        }
        try {
            ((List<String>) c).addAll(c2);
        }catch (Exception e){
            System.out.println("addAll(): "+e);
        }
        try {
            c.remove("C");
        }catch (Exception e){
            System.out.println("remove(): "+e);
        }
        try {
            list.set(0,"X");
            System.out.println("通过set(): "+list);
        }catch (Exception e){
            System.out.println("set(): "+e);
        }
    }
    public static void main(String[] args){
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" "));
        //作为Collection构造器的参数传递
        test("Modifiable",new ArrayList<String>(list));
        //Arrays.asList产生固定尺寸的List
        test("Arrays.asList()",list);
        //Collections.unmodifiableList()产生不可修改的列表
        test("unmodifiableList()", Collections.unmodifiableList(new ArrayList<String>(list)));
    }
}
