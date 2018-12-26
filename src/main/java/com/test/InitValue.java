package com.test;

/**
 * @author lmm
 * @Title: InitValue
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 18-12-26下午2:25
 */
public class InitValue {
    private int i;
    InitValue(int i){
        this.i=i;
    }

    @Override
    public String toString() {
        return "value: "+this.i;
    }

    public static void main(String[] args){
     InitValue initValue=new InitValue(2);
     System.out.println(initValue);
    }
}
