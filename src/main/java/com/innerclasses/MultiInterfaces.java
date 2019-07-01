package com.innerclasses;

/**
 * @Auther: linklmm
 * @Date: 2019/7/1 15:52
 * @Description:
 */
interface A {
}

interface B {
}

class X implements A, B {
}

class Y implements A {
    B makeB() {
        return new B() {
        };
    }
}

public class MultiInterfaces {
    public static void takesA(A a) {
    }

    public static void takesB(B b) {
    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}
