package com.generics;
class Other{}
class BasicOther extends BasicHolder<Other>{}
public class Unconstranined {
    public static void main(String[] args) {
        BasicOther b=new BasicOther(),b2=new BasicOther();
        b.set(new Other());
        Other other=b.get();
        b.f();
    }
}
