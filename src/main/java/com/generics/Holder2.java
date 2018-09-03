package com.generics;

public class Holder2 {
    private Object a;
    public Holder2(Object a){this.a=a;}
    public void  setA(Object a){this.a=a;}

    public Object getA() {
        return a;
    }

    public static void main(String[] args) {
        Holder2 h2=new Holder2(new Automobile());
        Automobile a= (Automobile) h2.getA();
        System.out.println(a);
        h2.setA("Not an Automobile");
        String s= (String) h2.getA();
        System.out.println(s);
        h2.setA(1);
        Integer x= (Integer) h2.getA();
        System.out.println(x);
    }
}