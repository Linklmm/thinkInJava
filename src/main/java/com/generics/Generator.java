package com.generics;
/**
 * 生成器，next（）方法用以产生新的对象
 * @author myfloweryourgrass
 *
 * */
public interface Generator<T> {
    T next();
}
