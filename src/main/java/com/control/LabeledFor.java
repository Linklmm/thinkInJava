package com.control;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author
 * @Date 2019-05-08 16:24
 * @Version 1.0
 * @Description 标签
 */
public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        //标签
        outer:
        for (; true; ) {
            inner:
            for (; i < 10; i++) {
                System.out.print("i = " + i);
                if (i == 2) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
                    i++;
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if (i == 8) {
                    //如果没有break outer语句，就没有办法从内部循环里跳出循环。
                    System.out.println("break outer");
                    break outer;
                }

                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}
