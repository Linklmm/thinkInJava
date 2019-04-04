package com.operators;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author minmin.liu(minmin.liu @ ucarinc.com)
 * @Date 2019-04-04 11:22
 * @Version 1.0
 * @Description 操作符练习5\6
 */
public class Dog {
    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public void say(){
        System.out.println("name:"+this.name);
        System.out.println("says:"+this.says);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }


    public static void main(String[] args) {
        Dog spot = new Dog("spot","Ruff");
        Dog scruffy = new Dog("scruffy","Wurf");
        spot.say();
        scruffy.say();

        Dog dog = new Dog("dog","汪汪");
        spot = dog;
        System.out.println(dog == spot);
        System.out.println(dog.equals(spot));
    }
}
