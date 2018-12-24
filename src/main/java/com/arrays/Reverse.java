package com.arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author lmm
 * @Title: Reverse
 * @ProjectName thinkInJava
 * @Description: 反转CompType的排序
 * @date 18-12-24下午4:27
 */
public class Reverse {
    public static void main(String[] args){
    CompType[] a = Generated.array(new CompType[12],CompType.generator());
    System.out.println("before sorting: "+ Arrays.toString(a));
    Arrays.sort(a, Collections.reverseOrder());
    System.out.println("before sorting: "+Arrays.toString(a));
    }
}
