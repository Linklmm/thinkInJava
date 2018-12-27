package com.containers;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @author lmm
 * @Title: SortedMapDemo
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 18-12-27下午4:51
 */
public class SortedMapDemo {
    public static void main(String[] args){
        TreeMap<Integer,String> sortedMap = new TreeMap<Integer, String>(new CountingMapData(10));
        System.out.println(sortedMap);
        Integer low = sortedMap.firstKey();
        Integer high = sortedMap.lastKey();
        Integer test = null;
        System.out.println(low);
        System.out.println(high);
        Iterator<Integer> it = sortedMap.keySet().iterator();
        //当i =3时，走了if中的next方法和else中的next方法
        for (int i=0;i<=6;i++){
            if (i == 3){
                low = it.next();
            }
            if (i == 6){
                high = it.next();
            }
            else{
                it.next();
            }
        }
        System.out.println("low: "+low);
        System.out.println("high: "+high);
        System.out.println("test: "+test);
        System.out.println(sortedMap.subMap(low,high));
        System.out.println(sortedMap.headMap(high));
        System.out.println(sortedMap.tailMap(low));
    }
}
