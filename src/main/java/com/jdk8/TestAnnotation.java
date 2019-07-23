package com.jdk8;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-23 14:55
 * @Version 1.0
 * @Description 重复注解与类型注解
 */
public class TestAnnotation {
    @MyAnnotation("hello")
    @MyAnnotation("world")
    public void show(@MyAnnotation("abc") String str){

    }

    @Test
    public void test1() throws NoSuchMethodException {
        Class<TestAnnotation> clazz = TestAnnotation.class;
        Method m1 = clazz.getMethod("show");

        MyAnnotation[] mas = m1.getAnnotationsByType(MyAnnotation.class);

        for (MyAnnotation my : mas){
            System.out.println(my.value());
        }
    }

    private Object obj = null;

}
