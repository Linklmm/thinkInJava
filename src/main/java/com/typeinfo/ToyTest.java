package com.typeinfo;
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
class Toy{
    Toy(){}
    Toy(int i){}
}
class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
    FancyToy(){super(1);}
}
public class ToyTest {
    static void printInfo(Class cc){
        System.out.print("Class name: "+cc.getName()+" is interface? ["+cc.isInterface()+"]");
        System.out.print("Simple name: "+cc.getSimpleName());
        System.out.println(" Canonical name: "+cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c=null;
        try {
            c=Class.forName("com.typeinfo.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face:c.getInterfaces())
            printInfo(face);
        Class up=c.getSuperclass();//查询其直接的基类
        System.out.println(up.getSimpleName());
        Object obj=null;

        try {
            obj=up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
