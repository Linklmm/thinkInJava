package com.jdk8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Java8内置的四大核心函数式接口
 * Comsumer<T>:消费型接口
 * void accept(T t)
 * Supplier<T>:供给型接口
 * T get()
 * Function<T,R>:函数型接口
 * R apply(T)
 * Predicate<T>:短言型接口
 * boolean test(T t)
 */
public class TestLambda3 {
    //供给型接口
    @Test
    public void productIntegerList() {
        List<Integer> list = generatorInteger(10, () -> (int) (Math.random() * 100));
        System.out.println(list.toString());
    }

    public List<Integer> generatorInteger(int num, Supplier<Integer> sup) {
        List list = new ArrayList();
        for (int i = 0; i < num; i++) {
            list.add(sup.get());
        }
        return list;
    }

    //消费型接口
    @Test
    public void test1() {
        happy(1000D, t -> System.out.println("一共消费：" + t + "元"));
    }

    public void happy(Double money, Consumer<Double> consumer) {
        consumer.accept(money);
    }
}
