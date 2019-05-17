package com.initalization;

/**
 * @Auther: linklmm
 * @Date: 2019/5/10 15:30
 * @Description:
 */
public class Leaf {
    private int i = 0;

    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }
}
