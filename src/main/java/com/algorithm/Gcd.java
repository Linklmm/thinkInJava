package com.algorithm;

/**
 * 描述:
 * 欧几里得算法
 *
 * @author lmm
 * @create 2018-11-12 4:27
 */
public class Gcd {
    /**
     * 
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p,int q){
        if (q==0){
            return p;
        }else {
            int r=p%q;
            return gcd(q,r);
        }
    }

    public static void main(String[] args) {
        System.out.println("gcd:"+gcd(3,2));
    }
}
