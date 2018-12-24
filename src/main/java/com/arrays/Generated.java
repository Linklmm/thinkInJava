package com.arrays;

import com.containers.CollectionData;
import com.generics.Generator;

import java.lang.reflect.Array;

/**
 * 版权声明：Copyright(c) 2018
 *
 * @program: ThreadTest
 * @Author minmin.liu
 * @Date 2018-12-18 17:23
 * @Version 1.0
 * @Description 从generator中创建数组,只能产生Object子类型的数组，而不能产生基本类型的数组
 */
public class Generated {
    //todoed；用到第17章的内容 CollectionData
    public static <T> T[] array(T[] a,Generator<T> gen){
        //所有的Collection子类型都拥有toArray()方法
        return new CollectionData<T> (gen , a.length).toArray(a);
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> type, Generator<T> gen, int size){
        T[] a = (T[]) Array.newInstance(type,size);
        return new CollectionData<T>(gen,size).toArray(a);
    }
}
