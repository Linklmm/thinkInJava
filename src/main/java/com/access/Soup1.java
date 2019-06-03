package com.access;

/**
 * @Auther: linklmm
 * @Date: 2019/6/3 15:05
 * @Description:非单例模式
 */
public class Soup1 {
    private Soup1(){}
    private static int i=0;

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Soup1.i = i;
    }

    public static Soup1 makeSoup(){
        i++;
        return new Soup1();
    }
}
