package com.algorithm;

public class StrStr {
    public int strStr(String haystack, String needle) {
        for (int i =0;i<haystack.length();i++){
            if (haystack.indexOf(needle,i)==-1){
                return -1;
            }else {
                return haystack.indexOf(needle,i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        StrStr s = new StrStr();
        int n =s.strStr("hello","ll");
        System.out.println(n);
    }
}
