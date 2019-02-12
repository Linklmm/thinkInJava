package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author minmin.liu
 * @Date 2019-02-12 16:03
 * @Version 1.0
 * @Description 寻找两个数组的中位数
 */
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, newArray, 0, nums1.length);
        System.arraycopy(nums2, 0, newArray, nums1.length, nums2.length);
        Arrays.sort(newArray);
        if (newArray.length % 2 == 0) {
            return (newArray[newArray.length / 2] + newArray[newArray.length / 2 - 1])/2.0;
        } else {
            return newArray[newArray.length/2];
        }
    }

    public static void main(String[] args) {
        FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();
        int[] nums1 ={1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays.findMedianSortedArrays(nums1,nums2));
    }
}
