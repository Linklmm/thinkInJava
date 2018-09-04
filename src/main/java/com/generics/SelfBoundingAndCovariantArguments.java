package com.generics;
/**
 * 使用了自限定，只能获得某个方法的一个版本，他将接受确切的参数类型
 *
 * */
interface SelfBoundSetter<T extends SelfBoundSetter<T>>{
    void set(T arg);
}

interface Setter extends SelfBoundSetter<Setter>{}
public class SelfBoundingAndCovariantArguments {
    void testA(Setter s1,Setter s2,SelfBoundSetter sbs){
        s1.set(s2);
        //s1.set(sbs);//error
    }
}
