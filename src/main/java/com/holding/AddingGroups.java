package com.holding;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts={6,7,8,9,10};
        ((ArrayList<Integer>) collection).addAll(Arrays.asList(moreInts));

        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);
        List<Integer> list=Arrays.asList(16,17,18,19,20);
        list.set(1,99);
        //list.add(21);会报UnsupportedOperationException
        for (Integer i:list) {
            System.out.println(i);
        }
        for (Integer c:collection) {
            System.out.print(c+", ");
        }
    }
}
