package com.algorithm;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author minmin.liu
 * @Date 2019-02-12 14:51
 * @Version 1.0
 * @Description 罗马数字转数字
 */
public class RomanToInt {
    public int romanToInt(String s) {
        int num = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case 'I':
                    num += 1;
                    break;
                case 'V':
                    num += 5;
                    if (i > 0 && c[i - 1] == 'I') {
                        num -= 1 * 2;
                    }
                    break;
                case 'X':
                    num += 10;
                    if (i > 0 && c[i - 1] == 'I') {
                        num -= 1 * 2;
                    }
                    break;
                case 'L':
                    num += 50;
                    if (i > 0 && c[i - 1] == 'X') {
                        num -= 10 * 2;
                    }
                    break;
                case 'C':
                    num += 100;
                    if (i > 0 && c[i - 1] == 'X') {
                        num -= 10 * 2;
                    }
                    break;
                case 'D':
                    num += 500;
                    if (i > 0 && c[i - 1] == 'C') {
                        num -= 100 * 2;
                    }
                    break;
                case 'M':
                    num += 1000;
                    if (i > 0 && c[i - 1] == 'C') {
                        num -= 100 * 2;
                    }
                    break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        RomanToInt romanToInt =new RomanToInt();
        System.out.println(romanToInt.romanToInt("V"));
    }
}
