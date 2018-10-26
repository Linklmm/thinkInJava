/**
 * 版权声明：Copyright(c) 2018 UCAR Inc. All Rights Reserved.
 *
 * @program: ThreadTest
 * @Author minmin.liu(minmin.liu @ ucarinc.com)
 * @Date 2018-10-26 16:12
 * @Version 1.0
 * @Description 三维数组
 */

package com.arrays;

import java.util.Arrays;

public class ThreeDWithNew {
    public static void main(String[] args) {
        int [][][] a=new int [2][3][4];
        System.out.println(Arrays.deepToString(a));
    }
}
