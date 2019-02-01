package com.strategy;

/**
 * @author lmm
 * @Title: AddStrategy
 * @ProjectName thinkInJava
 * @Description: 加法的具体实现
 * @date 19-1-31下午2:26
 */
public class AddStrategy implements Strategy {
    @Override
    public double calc(double paramA, double paramB) {
        System.out.println("Execute AddStrategy");
        return paramA + paramB;
    }
}
