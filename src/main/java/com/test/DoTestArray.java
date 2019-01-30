package com.test;

/**
 * @author lmm
 * @Title: DoTestArray
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 19-1-23下午5:36
 */
public class DoTestArray {
    public static void main(String[] args){
        TestArray testArray = new TestArray();
        Integer[] n =new Integer[3];
        for (int i =0;i<n.length;i++){
            n[i] =i;
        }
        testArray.setN(n);
        System.out.println(testArray.getN()[0]);
    }
}
