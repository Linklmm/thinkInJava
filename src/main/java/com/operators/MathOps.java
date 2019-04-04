package com.operators;

import java.util.Random;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author minmin.liu
 * @Date 2019-04-04 10:54
 * @Version 1.0
 * @Description 算术操作符的用法
 */
public class MathOps {
    public static void main(String[] args) {
        Random random = new Random(47);
        int i, j, k;
        j = random.nextInt(100) + 1;
        System.out.println("j:" + j);
        k = random.nextInt(100 + 1);
        System.out.println("k:" + k);
        i = j + k;
        System.out.println("j+k:" + i);
        i = j - k;
        System.out.println("j-k:" + i);
        i = k / j;
        System.out.println("k/j:" + i);
        i = k * j;
        System.out.println("k*j" + i);
        i = k % j;
        System.out.println("k%j" + i);
        j %= k;
        System.out.println("j%=k:" + j);
        float u, v, w;
        v = random.nextFloat();
        System.out.println("v:" + v);
        w = random.nextFloat();
        System.out.println("w:" + w);
        u = v + w;
        System.out.println("v+w:" + u);
        u = v - w;
        System.out.println("v-w: " + u);
        u = v * w;
        System.out.println("v*w:" + u);
        u = v / w;
        System.out.println("v/w:" + u);
        u += v;
        System.out.println("u+=v:" + u);
        u -= v;
        System.out.println("u-+v:" + u);
        u *= v;
        System.out.println("u*=v:" + u);
        u /= v;
        System.out.println("u/=v:" + u);
    }
}
