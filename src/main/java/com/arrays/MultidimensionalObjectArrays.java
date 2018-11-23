package com.arrays;

import java.util.Arrays;

/**
 * 版权声明：Copyright(c) 2018
 *
 * @program: ThreadTest
 * @Author minmin.liu
 * @Date 2018-11-23 17:45
 * @Version 1.0
 * @Description 对象数组
 */
public class MultidimensionalObjectArrays {
    public static void main(String[] args) {
        BerylliumSphere[][] spheres={
                {new BerylliumSphere(),new BerylliumSphere()},
                {new BerylliumSphere(),new BerylliumSphere(),
                new BerylliumSphere(),new BerylliumSphere()},
                {
                    new BerylliumSphere(),new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere(),new BerylliumSphere()
                }
        };
        System.out.println(Arrays.deepToString(spheres));
    }
}
