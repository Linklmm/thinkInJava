/**
 * 版权声明：Copyright(c) 2018 UCAR Inc. All Rights Reserved.
 *
 * @program: ThreadTest
 * @Author minmin.liu(minmin.liu @ ucarinc.com)
 * @Date 2018-10-25 15:50
 * @Version 1.0
 * @Description 返回一个数组
 */

package com.arrays;

import java.util.Arrays;
import java.util.Random;

public class IceCream {
    private static Random rand=new Random(47);
    static final String[] FLAVORS={
            "Chocolate","Strawberry","Vanilla Fudge Swirl","Mint Chip",
            "Mocha Almond Fudge","rum Raisin","Praline Cream","Mud Pie"
    };
    public static String[] flavorSet(int n){
        if (n>FLAVORS.length) {
            throw new IllegalArgumentException("see to big");
        }
        String[] results=new String[n];
        boolean[] picked=new boolean[FLAVORS.length];
        for (int i=0;i<n;i++){
            int t;
            do {
                t=rand.nextInt(FLAVORS.length);
            }while (picked[t]);
            results[i]=FLAVORS[t];
            picked[t]=true;
        }
        return results;
    }

    public static void main(String[] args) {
        for (int i=0;i<7;i++){
            System.out.println(Arrays.toString(flavorSet(3)));
        }
    }
}
