package com.innerclasses;

/**
 * @Auther: linklmm
 * @Date: 2019/7/1 15:56
 * @Description:多重继承
 */
class D {
    public String dName() {
        return getClass().getSimpleName();
    }
}

abstract class E {
    public void name() {
    }
}

class Z extends D {
    @Override
    public String dName() {
        return getClass().getSimpleName();
    }

    E makeE() {
        return new E() {
            @Override
            public void name() {
                System.out.println(getClass().getSimpleName());
            }
        };
    }
}

public class MultiImplementation {
    static void takesD(D d) {
    }

    static void takesE(E e) {
    }

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
        //打印为空
        z.makeE().name();
        System.out.println(z.dName());
    }
}
