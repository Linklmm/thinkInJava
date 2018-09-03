package com.generics;

public class Holder<T> {
    private T value;
    public Holder(){}
    public Holder(T val){value=val;}
    public void set(T val){value=val;}
    public T get(){return value;}

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> Apple=new Holder<Apple>(new Apple());
        Apple d=Apple.get();
        Apple.set(d);
        System.out.println(d);

        //不能使用set方法
        Holder<? extends Fruit> fruit=Apple;
        Fruit p=fruit.get();
        System.out.println(p);

        d= (com.generics.Apple) fruit.get();
        try {
            //ClassCastException
            Orange c= (Orange) fruit.get();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(fruit.equals(d));

    }
}
