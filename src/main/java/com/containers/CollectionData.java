package com.containers;

import com.generics.Generator;

import java.util.ArrayList;

/**
 * @author lmm
 * @Title: CollectionData
 * @ProjectName thinkInJava
 * @Description: CollectionData是适配器设计模式的一个实例，它将generator适配到collection的构造器上
 * @date 18-12-24上午11:27
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen , int quantity){
        for (int i=0;i<quantity;i++){
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> gen,int quantity){
        return new CollectionData<T>(gen,quantity);
    }
}
