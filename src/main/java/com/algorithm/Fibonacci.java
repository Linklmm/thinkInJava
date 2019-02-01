package com.algorithm;

/**
 * @author lmm
 * @Title: Fibonacci
 * @ProjectName thinkInJava
 * @Description: 菲波拉契兔子问题
 * @date 19-2-1下午2:50
 */
public class Fibonacci {
    private void fibonacci(int M){
        int f1= 0,f2=1,f;
        System.out.println(1);
        for (int i=0;i<M;i++){
            f = f2;
            f2 = f1+f2;
            f1 =f;
            System.out.println(f2);
        }
    }

    public static void main(String[] args){
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci(30);
    }
}
