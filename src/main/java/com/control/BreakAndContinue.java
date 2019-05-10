package com.control;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author
 * @Date 2019-05-08 16:13
 * @Version 1.0
 * @Description break和continue在for和while循环中的例子
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
