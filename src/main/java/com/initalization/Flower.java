package com.initalization;

/**
 * @Auther: linklmm
 * @Date: 2019/5/10 15:39
 * @Description:
 */
public class Flower {
    int pealCount =0;
    String s = "initial value";
    Flower(int peals){
        pealCount = peals;
        System.out.println("Constructor w/ int arg only, pealCount= "+pealCount);
    }
    Flower(String ss){
        System.out.println("Constructor w/ int arg only, s= "+ss);
    }

    Flower(String s,int peals){
        this(peals);
        this.s = s;
        System.out.println("String and int args");
    }
    Flower(){
        this("hi",47);
        System.out.println("default constructor (no args)");
    }
    void printPetalCount(){
        System.out.println("petalCount = "+pealCount+" s = "+s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
