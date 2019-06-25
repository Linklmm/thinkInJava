package com.interfaces;

import java.util.Random;

/**
 * @Auther: linklmm
 * @Date: 2019/6/25 17:39
 * @Description:
 */
public class RandomDoubles {
    private static Random rand = new Random(47);
    public double next(){
        return rand.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for (int i=0;i<7;i++){
            System.out.println(rd.next()+" ");
        }
    }
}
