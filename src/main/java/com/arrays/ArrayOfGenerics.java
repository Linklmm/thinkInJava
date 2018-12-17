package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lmm
 * @Title: ArrayOfGenerics
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 18-12-17下午4:11
 */
public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        List<String>[] ls;
        List[] la =new List[10];
        ls=(List<String>[]) la;
        ls[0]=new ArrayList<String>();
        Object[] objects=ls;
        objects[1] = new ArrayList<Integer>();

        List<BerylliumSphere>[] sphere=
                (List<BerylliumSphere>[]) new List[10];
        for (int i=0;i<sphere.length;i++){
            sphere[i]=new ArrayList<BerylliumSphere>();
        }
        System.out.println(Arrays.deepToString(sphere));

    }
}
