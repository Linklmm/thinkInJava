package com.algorithm;

import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i =0;
        int n =nums.length;
        while (i<n){
            if (nums[i] == val){
                nums[i]= nums[n-1];
                n--;
            }else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        RemoveElement removeElement = new RemoveElement();
        int length = removeElement.removeElement(nums,2);
        System.out.println(length);
    }
}
