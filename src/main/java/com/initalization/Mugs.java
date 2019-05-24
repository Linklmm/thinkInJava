package com.initalization;

/**
 * @Auther: linklmm
 * @Date: 2019/5/18 13:59
 * @Description:
 */
public class Mugs {
    Mug mug1;
    Mug mug2;

    Mugs(){
        System.out.println("Mugs()");
    }
    Mugs(int i){
        System.out.println("Mugs(int)");
    }
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}
