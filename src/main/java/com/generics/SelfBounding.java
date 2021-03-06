package com.generics;
class SelfBounded<T extends SelfBounded<T>>{
    T element;
    SelfBounded<T> set(T arg){
        element=arg;
        return this;
    }
    T get(){return element;}
}
class A extends SelfBounded<A>{}
class B extends SelfBounded<B>{}
class C extends SelfBounded<C>{
    C setAndGet(C arg){
        set(arg);return get();}
}
class D{}
//报错
//class E extends SelfBounded<D>{}
class F extends SelfBounded{}
public class SelfBounding {
    public static void main(String[] args) {
        A a=new A();
        a.set(new A());
        System.out.println(a);
        a=a.set(new A()).get();
        a=a.get();
        C c=new C();
        c=c.setAndGet(new C());
    }
}
