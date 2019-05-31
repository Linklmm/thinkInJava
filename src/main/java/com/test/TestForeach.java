package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author
 * @Date 2019-04-28 16:55
 * @Version 1.0
 * @Description 测试foreach
 */
public class TestForeach {
    public static void main(String[] args) {
        Human human = new Human(10, false, 175);
        Human human1 = new Human(11, false, 180);
        Human human2 = new Human(12, true, 100);
        List<Human> list = new ArrayList<Human>();
        list.add(human);
        list.add(human1);
        list.add(human2);
        System.out.println(list);
//        for (Human h:list){
//            if (h.getAge()==10){
//                list.remove(h);
//            }else if (h.getAge() == 12){
//                list.remove(h);
//            }
//        }
        for (int i=0;i<list.size();i++){
            if (list.get(i).getAge()==10){
                list.remove(i);
            }else if (list.get(i).getAge() ==12){
                list.remove(i);
            }
        }
        System.out.println(list);

//        Integer hight1 = null;
//        Integer hight2 = null;
//
//        for (Human h : list) {
//            if (h.getAge() == 10) {
//                hight1 = h.getHight();
//            }
//            if (h.getAge() == 11) {
//                hight2 = h.getHight();
//            }
//        }
//
//        for (Human h : list) {
//            if (h.getAge() == 12) {
//                h.setAge(h.getHight());
//            }
//        }
//        System.out.println(hight1);
//        System.out.println(hight2);
//        System.out.println(human2);
//        System.out.println(list.get(2));

    }
}
