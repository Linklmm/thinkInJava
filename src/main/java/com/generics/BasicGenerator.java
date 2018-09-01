package com.generics;
/**
 * 该类可以为任何类构造一个Generator，只要该类具有默认的构造器
 * @author myfloweryourgrass
 * */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;
    public BasicGenerator(Class<T> type){this.type=type;}
//生成一个对象
    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
