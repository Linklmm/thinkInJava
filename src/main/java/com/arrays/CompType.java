package com.arrays;

import com.generics.Generator;
import java.util.Arrays;
import java.util.Random;

/**
 * @author lmm
 * @Title: CompType
 * @ProjectName thinkInJava
 * @Description: 使用arrays.sort()演示比较的效果,如果调用的时候没有实现Comparable接口，调用sort方法的时候会抛出ClassCastException异常
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
        //如果当前对象小于参数则返回负值，如果等于返回0，大于返回正值
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
        CompType[] a = Generated.array(new CompType[12] , generator());
        System.out.println("before sorting : "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sorting : " + Arrays.toString(a));
    }
}
