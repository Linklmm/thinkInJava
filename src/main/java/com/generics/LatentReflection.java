package com.generics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author linklmm
 * 潜在类型机制
 * perform()方法就是用了潜在类型机制
 * */

class Mime{
    public void walkAgainstTheWind(){}
    public void sit(){System.out.println("Pretending to sit");}
    public void pushInvisibleWalls(){}

    @Override
    public String toString() {
        return "Mime";
    }
}
class SmartDog{
    public void speak(){System.out.println("Woof!");}
    public void sit(){System.out.println("Sitting");}
    public void reproduce(){}
}
class Robot{
    public void speak(){System.out.println("Click!");}
    public void sit(){System.out.println("Clank");}
}
class CommunicateReflectively{
    public static void perform(Object speaker){
        Class<?> spkr=speaker.getClass();//得到对象
        try {
            try {
                Method speak=spkr.getMethod("speak");//得到方法
                speak.invoke(speaker);
            } catch (NoSuchMethodException e) {
                System.out.println(speaker+"cannot speak!");
            }
            try {
                Method sit=spkr.getMethod("sit");
                sit.invoke(speaker);
            } catch (NoSuchMethodException e) {
                System.out.println(speaker+"cannot speak！");
            }
        } catch (Exception e) {
            throw new RuntimeException(speaker.toString(),e);
        }
    }
}
public class LatentReflection {
    public static void main(String[] args) {
        CommunicateReflectively.perform(new SmartDog());
        CommunicateReflectively.perform(new Robot());
        CommunicateReflectively.perform(new Mime());
    }
}
