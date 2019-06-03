package com.access;

/**
 * @Auther: linklmm
 * @Date: 2019/6/3 15:07
 * @Description:
 */
public class Lunch {
    void testPrivate(){
//        Soup1 soup = new Soup1();
    }
    void testStatic(){
        Soup1 soup = Soup1.makeSoup();
    }

    /**
     * 单例模式：始终只能创建它的一个对象
     */
    void testSingleton(){
        Soup2.access().f();
    }

    public static void main(String[] args) {
        Soup1 soup = Soup1.makeSoup();
        Soup1 soup1 = Soup1.makeSoup();
        System.out.println(soup);
        System.out.println(soup1);
        System.out.println(Soup1.getI());

        Soup2 soup2 = Soup2.access();
        Soup2 soup22 = Soup2.access();
        System.out.println(soup2);
        System.out.println(soup22);
    }

}
