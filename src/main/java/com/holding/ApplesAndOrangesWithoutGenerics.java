package com.holding;

import java.util.ArrayList;
/**
 * @author myFlowerYourGrass
 * 持有对象
 *
 * */
class Apple{
    private static long counter;
    private final long id=counter++;
    public long getId(){
        return id;
    }
}
class Orange{}
public class ApplesAndOrangesWithoutGenerics {
    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList<Apple>();
        for (int i=0;i<3;i++)
            apples.add(new Apple());
        //apples.add(new Orange());
        for (int i=0;i<apples.size();i++)
            System.out.println(((Apple)apples.get(i)).getId());
    }
}
