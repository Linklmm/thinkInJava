package com.reusing;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/5 14:02
 * @Description:
 */
public class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    private void g() {
        print("OverridingPrivate.g()");
    }
}
