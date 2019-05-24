package com.initalization;

/**
 * @Auther: linklmm
 * @Date: 2019/5/18 13:46
 * @Description:
 */
public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }
//    static Cups cups1 = new Cups();
//    static Cups cups2 = new Cups();
}
