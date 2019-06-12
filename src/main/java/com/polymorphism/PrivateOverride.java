package com.polymorphism;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/11 15:30
 * @Description:
 */
public class PrivateOverride {
        private void f(){
        print("private f()");
    }
//    public void f() {
//        print("private f()");
//    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        print("public f()");
    }
}
