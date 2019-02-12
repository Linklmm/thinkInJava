package com.algorithm;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author minmin.liu
 * @Date 2019-02-12 14:28
 * @Version 1.0
 * @Description 是否是回文数
 */
public class IsPalindrome {
    public boolean isPalindrome(int x){
        String s = String.valueOf(x);
        char[] c = s.toCharArray();
        for (int i = 0;i<c.length/2;i++){
            if (c[i]!=c[c.length-i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(10));
    }
}
