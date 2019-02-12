package com.algorithm;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author minmin.liu
 * @Date 2019-02-12 15:16
 * @Version 1.0
 * @Description Z字形变换
 */
public class Convert {
    public String convert(String s, int numRows){
        if (numRows == 1) {
            return s;
        }
        String result = "";
        char[] c = s.toCharArray();
        for (int i =0;i<numRows;i++) {
            while (i < c.length) {
                result = result + c[i];
                i += (numRows - 1) * 2;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Convert convert = new Convert();
        System.out.println(convert.convert("LEETCODEISHIRING",3));
    }
}
