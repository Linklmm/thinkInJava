package com.access;

/**
 * @Auther: linklmm
 * @Date: 2019/6/3 15:06
 * @Description:单例模式
 */
public class Soup2 {
    private Soup2(){}
    private static Soup2 ps1 =new Soup2();
    public static Soup2 access(){
        return ps1;
    }
    public void f(){}
}
