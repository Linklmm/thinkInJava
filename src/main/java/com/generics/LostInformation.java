package com.generics;

import java.util.*;

/**
 * @author linklmm
 * 对ErasedTypeEauivalence类谜题的解答
 *java泛型是使用擦除来实现的，这意味着当你在使用泛型时，任何具体的类型信息都被擦除了，你唯一知道的就是你在使用一个对象，
 * 因此List<String>和List<Integer>在运行事实上是相同的类型
 * */
class Frob{}
class Fnorkle{}
class Quark<Q>{}
class Particle<POSITION,MOMENTUM>{}

public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list=new ArrayList<Frob>();
        Map<Frob,Fnorkle> map=new HashMap<Frob,Fnorkle>();
        Quark<Fnorkle> quark=new Quark<Fnorkle>();
        Particle<Long,Double> p=new Particle<Long,Double>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
    }
}
