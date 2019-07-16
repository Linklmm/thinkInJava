package com.jdk8;

import org.junit.jupiter.api.Test;

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
 */
public class TestStreamAPI2 {
    List<Employe> employes = Arrays.asList(
            new Employe("张三",18,9999.99),
            new Employe("李四",58,5555.5),
            new Employe("王五",26,3333.3),
            new Employe("赵柳",36,6666.66),
            new Employe("田七",12,8888.88),
            new Employe("田七",12,8888.88),
            new Employe("田七",12,8888.88),
            new Employe("田七",12,8888.88)

    );

    @Test
    public void test1(){
        //中间操作不会有结果
        Stream<Employe> s = employes.stream()
                .filter((e)->{
                                System.out.println("Stream API 的中间操作");
                        return e.getAge()>35;});
        //终止操作：一次性的执行全部内容，即"惰性求值"
        s.forEach(System.out::println);
    }

    @Test
    public void test2(){
        employes.stream()
                .filter((e)->{
                    System.out.println("短路！");
                    return e.getMoney()> 5000;
                })
                .limit(2)
                .forEach(System.out::println);
    }
    @Test
    public void test3(){
        employes.stream()
                .filter((e)->
                    e.getMoney()>5000
                ).skip(2)
                .distinct()
                .forEach(System.out::println);
    }
}
