package com.generics;

import com.generics.Coffee.Coffee;
import com.generics.Coffee.CoffeeGenerator;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
    //将gen的n个元素加到coll中
    //n 填充多少个元素
    public static <T>Collection<T> fill(Collection<T> coll,Generator<T> gen,int n){
        for (int i=0;i<n;i++){
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees=fill(new ArrayList<Coffee>(),new CoffeeGenerator(),4);
        for (Coffee c:coffees) {
            System.out.println(c);
        }
        Collection<Integer> fnumbers=fill(new ArrayList<Integer>(),new Fibonacci(),18);
        for (int i:fnumbers) {
            System.out.println(i+", ");
        }
    }
}
