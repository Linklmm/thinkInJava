package com.typeinfo.interfacea;

public class InterfaceViolation {
    public static void main(String[] args) {
        A a=new B();
        a.f();
        //((B) a).g();
        System.out.println(a.getClass().getName());
        if (a instanceof B){
            B b=(B)a;
            b.g();
        }
    }
}
