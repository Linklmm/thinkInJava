package com.algorithm;

import java.math.BigDecimal;
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
        BigDecimal a= new BigDecimal(32);
        BigDecimal b= new BigDecimal(21);
        BigDecimal sub=a.subtract(b);
        System.out.println(sub);
        BigDecimal div=sub.divide(a,4,BigDecimal.ROUND_HALF_EVEN);
        System.out.println(div);

        BigDecimal mul=div.multiply(new BigDecimal(100));
        System.out.println(mul);
    }
}
