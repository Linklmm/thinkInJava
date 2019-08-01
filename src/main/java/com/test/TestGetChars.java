package com.test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-30 08:01
 * @Version 1.0
 * @Description getChars()方法
 */
public class TestGetChars {
    public static void main(String[] args) {
        String str1 = new String("www.linkfor.com");
        char[] str2 = {'1','2','3','4','5','6','7','8','9'};

        try {
            str1.getChars(4,11,str2,1);
//        str1.getChars(str2,str2.length);
//  String下的默认方法，包内可用
            System.out.println("拷贝的字符串为：");
            System.out.println(str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List list = Arrays.asList(str2);
        System.out.println(list.size());
        System.out.println(list.get(0));
//        list.remove(0);java.lang.UnsupportedOperationException
    }

    @Test
    public void testArraycopy(){
        char[] chars1 ={'1','2','3','4','5'};
        char[] chars2 = {'6','7','8','9','0'};

        System.arraycopy(chars1,0,chars2,2,3);
        System.out.println(chars2);
    }
}
