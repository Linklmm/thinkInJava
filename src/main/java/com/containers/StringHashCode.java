package com.containers;

/**
 * @author lmm
 * @Title: StringHashCode
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 19-1-15上午11:37
 */
public class StringHashCode {
    public static void main(String[] args){
     String[] hellos = "Hello Hello".split(" ");
     System.out.println(hellos[0].hashCode());
     System.out.println(hellos[1].hashCode());
     String s = new String("world");
     String s2 ="world";
     String s3 = "world";
     System.out.println(s.hashCode());
     System.out.println(s2.hashCode());
     System.out.println(s3.hashCode());
     System.out.println(s == s2);
     System.out.println(s2==s3);
    }
}
