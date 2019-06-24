package com.interfaces;

/**
 * @Auther: linklmm
 * @Date: 2019/6/24 17:23
 * @Description:java中的多重继承
 */
interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {
        System.out.println(getClass().getSimpleName() + ".fight()");
    }
}

class Hero extends ActionCharacter
        implements CanFight, CanSwim, CanFly {
    @Override
    public void swim() {
        System.out.println("hero can swim");
    }

    @Override
    public void fly() {
        System.out.println("hero can fly");
    }

//    @Override
//    public void fight() {
//        System.out.println("hero can fight");
//    }
}

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
