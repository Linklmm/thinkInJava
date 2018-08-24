package com.algorithm;

import java.util.*;

public class Solution {
   /**
    * url；https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
    * https://leetcode-cn.com/articles/longest-substring-without-repeating-characters/
    * 求最长子串
    *
    * */
    public int lengthOfLongestSubstring(String s) {
        if(s== null)   //所有可能出现的问题都应该考虑在内
            return 0;

        int length = 0;//初始化最长的长度
        //char[] c = s.toCharArray();
        HashMap<Character , Integer> map = new HashMap<Character , Integer>();
        for(int i=0; i<s.length(); i++){
            //当map集合中没有该字符的重复子串
            if(! map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
                //System.out.println("size"+map.size());
                //System.out.println(map.get(s.charAt(i)));
            }else{
                length = Math.max(length,map.size());
                //System.out.println("length:"+length);
                i = map.get(s.charAt(i));
                map.clear();
            }
        }

        return Math.max(length, map.size());

    }
    /**
     * https://leetcode-cn.com/problems/two-sum/description/
     * 两数之和
     * */
    public int[] twoSum(int[] nums, int target) {
        if (nums.length<=2){
            System.out.println("数组为空或者数组长度小于2！");
        }
        int[] s=new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    s[0]=i;
                    s[1]=j;
                    return s;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        String s="pwwkew";
        //System.out.println(s.charAt(1));
        int i=solution.lengthOfLongestSubstring("pwwkew");
        //int i=solution.lengthOfSubstring(s,'w');
        //System.out.println(i);
        int [] ints=new int[]{2};
        int[] targets=new int[2];
        targets=solution.twoSum(ints,9);
        for (int j=0;j<targets.length;j++){
            System.out.println(targets[j]);
        }
    }
}
