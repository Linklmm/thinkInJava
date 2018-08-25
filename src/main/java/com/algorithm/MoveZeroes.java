package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {
    public static void moveZeroes(int[] nums){
        //得到去零后的数组
        ArrayList<Integer> nonZeroElements=new ArrayList<Integer>();
        for (int i=0;i<nums.length;i++)
            if (nums[i]!=0){
                nonZeroElements.add(nums[i]);
        }

        //System.out.println(nonZeroElements.size());
        for (int i=0;i<nonZeroElements.size();i++)
            nums[i]=nonZeroElements.get(i);
        //System.out.println(nums.length);
        //将置零的数组置后
        for (int i=nonZeroElements.size();i<nums.length;i++)
            nums[i]=0;
    }

    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int[] target=arr;
        moveZeroes(target);
        for (int i=0;i<target.length;i++)
            System.out.println(target[i]);
    }
}
