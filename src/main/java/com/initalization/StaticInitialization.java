package com.initalization;

/**
 * @Auther: linklmm
 * @Date: 2019/5/17 15:36
 * @Description:
 */
public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("creating new Cupboard() in main");
        new Cupboard();
        System.out.println("creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
