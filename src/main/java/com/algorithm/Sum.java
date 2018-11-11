package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static int sum(List<Integer> n){
        if (n.size() == 0) {
            return 0;
        }else {
            int m=n.get(0);
            n.remove(0);
            return m+sum(n);
        }
    }

    public static void main(String[] args) {
        List<Integer> n=new ArrayList<>();
        n.add(4);
        n.add(2);
        n.add(6);
        int m=sum(n);
        System.out.println("m:"+m);
    }
}
