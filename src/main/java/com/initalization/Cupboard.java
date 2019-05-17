package com.initalization;

/**
 * @Auther: linklmm
 * @Date: 2019/5/17 15:34
 * @Description:
 */
public class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard(){
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker){
        System.out.println("f3("+marker+")");
    }
    static Bowl bowl5 = new Bowl(5);
}
