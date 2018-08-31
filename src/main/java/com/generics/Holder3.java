package com.generics;
/**
 * @author myfloweryourgrass
 * @create 2018/08/31
 * */
public class Holder3<T> {
    private T a;
    public Holder3(T a){this.a=a;}
    public void setA(T a) {
        this.a = a;
    }
    public T getA() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3=new Holder3<Automobile>(new Automobile());
        Automobile a=h3.getA();
        //报错h3.setA("Not an Aotomobile");
        //h3.setA(1);//报错
    }
}
