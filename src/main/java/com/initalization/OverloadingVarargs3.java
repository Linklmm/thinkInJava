package com.initalization;

/**
 * @Auther: linklmm
 * @Date: 2019/5/24 10:05
 * @Description:
 */
public class OverloadingVarargs3 {
    static void f1(float i, Character... args) {
        System.out.println("first");
    }

    static void f1(char c, Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        OverloadingVarargs3.f1(1, 'a');
        OverloadingVarargs3.f1('a', 'b');
    }
}
