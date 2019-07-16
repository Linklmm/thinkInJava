package com.jdk8;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 方法引用：若Lambda体的内容中，有方法已经实现了，我们可以使用"方法引用"
 * （可以理解为方法引用是Lambda表达式的另外一种表现形式）
 * <p>
 * <p>
 * 主要有三种语法格式：
 * <p>
 * 对象::实例方法名
 * <p>
 * 类::静态方法名
 * 类::实例方法
 * <p>
 * 注意：
 * 1、Lambda体中调用方法的参数列表与返回值类型，要与函数式接口中抽象方法的函数列表和和返回值类型保持一致！
 * 2、若Lambda参数列表中的第一参数是实例方法的调用者，而第二个参数是实例方法的参数时，可以使用ClassName::method
 */
public class TestMethodRef {

    //数组引用
    @Test
    public void test3() {
        Function<Integer, String[]> fun = (x) -> new String[x];
        String[] strs = fun.apply(10);
        System.out.println(strs.length);

        Function<Integer, String[]> fun2 = String[]::new;
        String[] strs2 = fun2.apply(20);
        System.out.println(strs2.length);
    }

    @Test
    public void test1() {
        Consumer<String> con = (x) -> System.out.println(x);
        con.accept("hello");

//        对象::实例方法名
        PrintStream ps = System.out;
        Consumer<String> con1 = ps::println;
        con.accept("方法引用");
    }

    //类::静态方法名
    @Test
    public void test2() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);

        Comparator<Integer> com1 = Integer::compare;

    }

    //    类::实例方法
    BiPredicate<String, String> bp = (x, y) -> x.equals(y);

    BiPredicate<String, String> bp2 = String::equals;
}
