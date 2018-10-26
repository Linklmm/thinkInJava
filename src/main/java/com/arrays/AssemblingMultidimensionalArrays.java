/**
 * 版权声明：Copyright(c) 2018 UCAR Inc. All Rights Reserved.
 *
 * @program: ThreadTest
 * @Author minmin.liu(minmin.liu @ ucarinc.com)
 * @Date 2018-10-26 16:48
 * @Version 1.0
 * @Description 非基本类型的对象数组
 */

package com.arrays;

import java.util.Arrays;

public class AssemblingMultidimensionalArrays {
    public static void main(String[] args) {
        Integer[][] a;
        a=new Integer[3][];
        for (int i=0;i<a.length;i++){
            a[i]=new Integer[3];
            System.out.println(Arrays.deepToString(a));
            for (int j=0;j<a.length;j++){
                a[i][j]=i*j;
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
