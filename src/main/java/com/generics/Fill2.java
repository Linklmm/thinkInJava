package com.generics;

import com.generics.Coffee.Coffee;
import com.generics.Coffee.Latte;
import com.generics.Coffee.Mocha;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author linklmm
 * 适配器模式
 * */

interface Addable<T>{void add(T t);}

public class Fill2 {
    //classtoken version
    public static <T> void fill(Addable<T> addable,Class<?extends T> classtoken,int size){
        for (int i=0;i<size;i++) {
            try {
                addable.add(classtoken.newInstance());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    //generator version
//    public static <T> void fill(Addable<T> addable,Generator<T> generator,int size){
//        for (int i=0;i<size;i++)
//            addable.add(generator.next());
//    }
}
class AddableCollectionAdapter<T> implements Addable<T>{
    private Collection<T> c;
    public AddableCollectionAdapter(Collection<T> c){
        this.c=c;
    }
    @Override
    public void add(T item) {
        c.add(item);
    }
}
class Adapter{
    public static <T> Addable<T> collectionAdapeter(Collection<T> c){
        return new AddableCollectionAdapter<T>(c);
    }
}
class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T>{
    @Override
    public void add(T t) {
        super.add(t);
    }
}

class Fill2Test{
    public static void main(String[] args) {
        List<Coffee> carrier=new ArrayList<Coffee>();
        Fill2.fill(new AddableCollectionAdapter<Coffee>(carrier),Coffee.class,3);

        Fill2.fill(Adapter.collectionAdapeter(carrier),Latte.class,2);

        for (Coffee c:carrier)
            System.out.println(c);
        System.out.println("-------------------");
        AddableSimpleQueue<Coffee> coffeeQueue=new AddableSimpleQueue<Coffee>();
        Fill2.fill(coffeeQueue,Mocha.class,4);
        Fill2.fill(coffeeQueue,Latte.class,1);
        for (Coffee c:coffeeQueue)
            System.out.println(c);
    }
}
