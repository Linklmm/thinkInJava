package com.polymorphism;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/12 17:35
 * @Description:继承与清理
 */
class Characteristic{
    private String s;

    public Characteristic(String s) {
        this.s = s;
        print("Creating Characteristic "+s);
    }
    protected void dispose(){
        print("disposing Characteristic "+s);
    }
}
class Description{
    private String s ;

    public Description(String s) {
        this.s = s;
        print("Creating Description "+s);
    }
    protected void dispose(){
        print("disposing Description "+s);
    }
}
class LivingCreature{
    private Characteristic p = new Characteristic("is alive");
    private Description t = new Description("Basic Living Creature");
    LivingCreature(){
        print("LivingCreature()");
    }
    protected void dispose(){
        print("LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}
class Animal extends LivingCreature{
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("Animal not Vegetable");

    public Animal() {
        print("Animal()");
    }
    @Override
    protected void dispose(){
        print("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
class Amphibian extends Animal{
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");

    Amphibian() {
        print("Amphibian()");
    }
    @Override
    protected void dispose(){
        print("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
public class Frog extends Amphibian{
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");
    Frog() {
        print("Frog()");
    }
    @Override
    protected void dispose(){
        print("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        print("Bye!");
        frog.dispose();
    }
}
