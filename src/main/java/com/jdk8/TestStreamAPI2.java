package com.jdk8;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-16 22:00
 * @Version 1.0
 * @Description Stream的中间操作
 * <p>
 * 筛选与切片：
 * filter——接收Lambda，从流中排除某些元素。
 * limit——截断流，使其元素不超过给定数量
 * skip——跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流，与limit（n）互补
 * distinct——筛选，通过流所生成元素的hashCode（）和equals（）去除重复元素
 */
public class TestStreamAPI2 {
    List<Employe> employes = Arrays.asList(
            new Employe("张三", 18, 9999.99),
            new Employe("李四", 58, 5555.5),
            new Employe("王五", 26, 3333.3),
            new Employe("赵柳", 36, 6666.66),
            new Employe("田七", 12, 8888.88),
            new Employe("田七", 12, 8888.88),
            new Employe("田七", 12, 8888.88),
            new Employe("田七", 12, 8888.88)

    );

    @Test
    public void test1() {
        //中间操作不会有结果
        Stream<Employe> s = employes.stream()
                .filter((e) -> {
                    System.out.println("Stream API 的中间操作");
                    return e.getAge() > 35;
                });
        //终止操作：一次性的执行全部内容，即"惰性求值"
        s.forEach(System.out::println);
    }

    @Test
    public void test2() {
        employes.stream()
                .filter((e) -> {
                    System.out.println("短路！");
                    return e.getMoney() > 5000;
                })
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    public void test3() {
        employes.stream()
                .filter((e) ->
                        e.getMoney() > 5000
                ).skip(2)
                .distinct()
                .forEach(System.out::println);
    }

    /**
     * map映射
     */
    @Test
    public void test4() {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");

        list.stream().map((str) -> str.toUpperCase())
                .forEach(System.out::println);

        employes.stream().map(Employe::getName)
                .forEach(System.out::println);
        System.out.println("--------------------");
        Stream<Stream<Character>> stream = list.stream()
                .map(TestStreamAPI2::filterCharacter);
        stream.forEach((sm) -> {
            sm.forEach(System.out::println);
        });

        System.out.println("------------------");

        Stream<Character> sm2 =
                list.stream()
                        .flatMap(TestStreamAPI2::filterCharacter);
        sm2.forEach(System.out::println);
    }

    @Test
    public void test5() {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");
        List list1 = new ArrayList();
        list1.add(111);
        list1.add(222);
        list1.add(list);
        System.out.println(list1);
        list1.addAll(list);
        System.out.println(list1);
    }

    public static Stream<Character> filterCharacter(String str) {
        List<Character> list = new ArrayList<>();

        for (Character c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    /**
     * 排序
     * sorted()——自然排序
     * sorted(Comparator com)——定制排序
     */
    @Test
    public void test6() {
        List<String> list = Arrays.asList("fff", "aaa", "bbb", "ccc", "ddd", "eee");
        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-------------");

        employes.stream()
                .sorted((e1,e2)->{
                    if (e1.getAge().equals(e2.getAge())){
                        return e1.getName().compareTo(e2.getName());
                    }else {
                        return e1.getAge().compareTo(e2.getAge());
                    }
                })
                .forEach(System.out::println);
    }
}
