package com.containers;

import com.arrays.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author lmm
 * @Title: CollectionDataGeneration
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 18-12-24下午5:15
 */
public class CollectionDataGeneration {
    public static void main(String[] args){
     System.out.println(new ArrayList<String>(CollectionData.list(new RandomGenerator.String(9),10)));
     System.out.println(new HashSet<Integer>(new CollectionData<Integer>(new RandomGenerator.Integer(),10)));
    }
}
