package com.typeinfo;

import java.lang.reflect.Field;
/**
 * final在遭遇修改时是安全的
 * @author myfloweryourgrass
 * @create 2018/08/30
 * */
class WithPrivateFinalField{
    private int i=1;
    private final String s="I'm totally safe";
    private String s2="Am I safe?";
    @Override
    public String toString(){
        return "i="+i+", "+s+", "+s2;
    }
}
public class ModifyingPrivateFields {
    public static void main(String[] args) throws Exception {
        WithPrivateFinalField pf=new WithPrivateFinalField();
        System.out.println(pf);
        Field f=pf.getClass().getDeclaredField("i");//getDeclaredField是可以获取一个类的所有字段.
        f.setAccessible(true);
        System.out.println("f.getInt(pf): "+f.getInt(pf));
        f.setInt(pf,47);
        System.out.println(pf);

        f=pf.getClass().getDeclaredField("s");
        f.setAccessible(true);
        System.out.println("f.get(pf): "+f.get(pf));

        f.set(pf,"No,you're not!");
        System.out.println(pf);
        f=pf.getClass().getDeclaredField("s2");
        f.setAccessible(true);
        System.out.println("f.get(pf): "+f.get(pf));
        f.set(pf,"No, you'are not!");
        System.out.println(pf);
    }
}
