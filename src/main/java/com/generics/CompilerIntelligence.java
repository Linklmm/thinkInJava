package com.generics;

import java.util.Arrays;
import java.util.List;

public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist=Arrays.asList(new Apple());
        Apple a= (Apple) flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());
        System.out.println(flist.contains(new Apple()));
        System.out.println(flist.indexOf(new Apple()));
    }
}
