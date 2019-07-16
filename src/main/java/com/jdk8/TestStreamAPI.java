package com.jdk8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream的三个操作步骤：
 * 创建Stream
 * 中间操作
 * 终止操作（终端操作）
 */
public class TestStreamAPI {
    //创建Stream
    @Test
    public void test1(){
        //1.可以通过Collection 系列集合提供的stream(串行)或parallelStream(并行)
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        //4 通过生成创建无限流
        Stream.generate(()->Math.random()).limit(10).forEach(System.out::println);
    }
}
