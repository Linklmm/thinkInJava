package com.reusing;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/5 14:05
 * @Description:
 */
public class OverridingPrivate2 extends OverridingPrivate{
    public final void f(){
        print("OverridingPrivate2.f()");
    }
    public void g(){
        print("OverridingPrivate2.g()");
    }

    public static void main(String[] args) {
        OverridingPrivate2 op2=new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
//        op.f();
//        op.g();
    }
}
