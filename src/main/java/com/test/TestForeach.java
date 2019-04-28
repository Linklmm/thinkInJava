package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author minmin.liu(minmin.liu @ ucarinc.com)
 * @Date 2019-04-28 16:55
 * @Version 1.0
 * @Description 测试foreach
 */
public class TestForeach {
    public static void main(String[] args) {
        Human human = new Human(10,false,175);
        Human human1 = new Human(11,false,180);
        List<Human> list = new ArrayList<Human>();
        list.add(human);
        list.add(human1);

        Integer hight1=null ;
        Integer hight2=null;

        for (Human h : list){
            if (h.getAge() == 10){
                hight1 = h.getHight();
            }
            if (h.getAge() == 11){
                hight2 = h.getHight();
            }
        }

       System.out.println(hight1);
        System.out.println(hight2);

    }
}
