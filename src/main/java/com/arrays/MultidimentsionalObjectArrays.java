/**
 * 版权声明：Copyright(c) 2018 UCAR Inc. All Rights Reserved.
 *
 * @program: ThreadTest
 * @Author minmin.liu(minmin.liu @ ucarinc.com)
 * @Date 2018-10-26 16:41
 * @Version 1.0
 * @Description 数组
 */

package com.arrays;

import java.util.Arrays;

public class MultidimentsionalObjectArrays {
    public static void main(String[] args) {
        BerylliumSphere[][] spheres={{new BerylliumSphere(),new BerylliumSphere()},
                {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()},
                {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),
                new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()}};
        System.out.println(Arrays.deepToString(spheres));
    }
}
