package com.algorithm;

import java.lang.annotation.ElementType;
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
    //时间复杂度O(n)
    //空间复杂度O(1)
    public static void moveZeroes2(int[] nums){
        int k=0;//mums中，[0.....k]的元素均为非0元素
        //遍历到第i个元素后，保证[0.....i]中所有非0元素都按照顺序排列在[0...k]中
        for(int i=0;i<nums.length;i++)
            if (nums[i]!=0)
                nums[k++]=nums[i];
        for (int i=k;i<nums.length;i++){
            nums[i]=0;
        }
    }

    public static void moveZeroes3(int[] nums){
        int k=0;//mums中，[0.....k]的元素均为非0元素
        //遍历到第i个元素后，保证[0.....i]中所有非0元素都按照顺序排列在[0...k]中
        //同时，[k...i]为0
        for(int i=0;i<nums.length;i++)
            if (nums[i]!=0)//当数组为非0数组时
                if(i!=k)
                swap(nums,k++,i);
        else
            k++;
    }
    //数组中的两个元素进行交换
    public static void swap(int[] arry,int x,int y){
        if (x<=arry.length-1&&y<=arry.length-1) {
            int xx = arry[x];
            int yy = arry[y];
            arry[x] = yy;
            arry[y] = xx;
        }else {
            System.out.println("数组下标超出范围！");
        }
    }

    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int[] target=arr;
        //moveZeroes(target);
        moveZeroes3(target);
        for (int i=0;i<target.length;i++)
            System.out.print(target[i]+" ");
    }
}
