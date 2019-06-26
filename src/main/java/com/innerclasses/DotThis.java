package com.innerclasses;

/**
 * @Auther: linklmm
 * @Date: 2019/6/26 17:09
 * @Description:
 */
public class DotThis {
    void f(){
        System.out.println(getClass().getSimpleName()+".f()");
    }
    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
