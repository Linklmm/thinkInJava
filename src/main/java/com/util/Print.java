package com.util;

import java.io.PrintStream;

/**
 * @Auther: linklmm
 * @Date: 2019/5/29 16:22
 * @Description:
 */
public class Print {
    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void print() {
        System.out.println();
    }

    public static void printb(Object obj) {
        System.out.print(obj);
    }

    public static PrintStream print(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
