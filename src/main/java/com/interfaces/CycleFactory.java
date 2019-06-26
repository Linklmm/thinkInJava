package com.interfaces;

/**
 * @Auther: linklmm
 * @Date: 2019/6/26 14:42
 * @Description:练习18
 */
interface Cycle{
    void desc();
}
interface CycleFactories{
    Cycle getCycle();
}
class Unicycle implements Cycle{
    @Override
    public void desc() {
        System.out.println("this is "+getClass().getSimpleName());
    }
}
class Bicycle implements Cycle{
    @Override
    public void desc() {
        System.out.println("this is "+getClass().getSimpleName());
    }
}
class Tricycle implements Cycle{
    @Override
    public void desc() {
        System.out.println("this is "+getClass().getSimpleName());
    }
}
class UnicycleFactory implements CycleFactories{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
class BiFactory implements CycleFactories{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
class TriFactory implements CycleFactories{
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class CycleFactory {
    public static void takeDesc(CycleFactories factories){
        Cycle cycle = factories.getCycle();
        cycle.desc();
    }

    public static void main(String[] args) {
        takeDesc(new UnicycleFactory());
        takeDesc(new BiFactory());
        takeDesc(new TriFactory());
    }
}
