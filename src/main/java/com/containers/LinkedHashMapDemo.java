package com.containers;

import java.util.LinkedHashMap;

/**
 * @author lmm
 * @Title: LinkedHashMapDemo
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 18-12-27下午5:00
 */
public class LinkedHashMapDemo {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<Integer, String>(new CountingMapData(9));
        System.out.println(linkedHashMap);

        linkedHashMap =new LinkedHashMap<Integer, String>(16,0.75f,true);
        linkedHashMap.putAll(new CountingMapData(8));
        System.out.println(linkedHashMap);

        //只访问过前面6个元素后，最后2个元素移到队列的前面
        for (int i=0;i<6;i++){
            linkedHashMap.get(i);
        }
        System.out.println(linkedHashMap);

        //再一次访问0元素，它就被移到队列的后端
        linkedHashMap.get(0);
        System.out.println(linkedHashMap);
    }
}
