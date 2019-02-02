package com.algorithm;

import java.util.zip.Inflater;

/**
 * @author lmm
 * @Title: Fibonacci
 * @ProjectName thinkInJava
 * @Description: 菲波拉契兔子问题
 * @date 19-2-1下午2:50
 */
public class Fibonacci {
    private void fibonacci(int M) {
        long f1 = 0l, f2 = 1l, f;
        System.out.println(1);
        for (int i = 0; i < M; i++) {
            f = f2;
            f2 = f1 + f2;
            f1 = f;
            System.out.println(f2);
        }
    }

    private long fibonacci2(int m) {
        if (m == 0) {
            return 1;
        }
        if (m == 1) {
            return 1;
        }
        return fibonacci2(m - 1) + fibonacci2(m - 2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci(50);
        System.out.println("================");
        System.out.println(fibonacci.fibonacci2(50));
    }
}
