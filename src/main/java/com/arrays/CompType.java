package com.arrays;

import com.generics.Generator;

import java.security.PublicKey;
import java.util.Random;

/**
 * @author lmm
 * @Title: CompType
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 18-12-19上午11:17
 */
public class CompType implements Comparable<CompType> {
    int i;
    int j;
    private static int count=1;
    public CompType(int n1,int n2){
        i = n1;
        j = n2;
    }

    @Override
    public String toString() {
        String result="[i = "+i+" , j = "+j+" ]";
        if (count++ % 3 == 0){
            result+= "\n";}
        return result;
    }

    @Override
    public int compareTo(CompType rv) {
        return (i < rv.i ? -1:(i == rv.i ? 0: 1));
    }

    private static Random r =new Random(47);
    public static Generator<CompType> generator(){
        return new Generator<CompType>() {
            @Override
            public CompType next() {
                return new CompType(r.nextInt(100),r.nextInt(100));
            }
        };
    }
    public static void main(String[] args){
    }
}
