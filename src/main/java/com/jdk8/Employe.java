package com.jdk8;

import java.util.Objects;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-16 22:02
 * @Version 1.0
 * @Description
 */
public class Employe {
    private String name;
    private int age;
    private double money;
    private Status status;

    public Employe(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public Employe(String name, int age, double money, Status status) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", status=" + status +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return age == employe.age &&
                Double.compare(employe.money, money) == 0 &&
                name.equals(employe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, money);
    }

    public enum Status{
        FREE,
        BUSY,
        VOCATION;
    }
}
