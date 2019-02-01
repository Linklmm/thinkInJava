package com.strategy;

/**
 * @author lmm
 * @Title: MultiStrategy
 * @ProjectName thinkInJava
 * @Description: 乘法具体实现的策略
 * @date 19-1-31下午2:29
 */
public class MultiStrategy implements Strategy {
    @Override
    public double calc(double paramA, double paramB) {
        System.out.println("Execute MultiStrategy");
        return paramA * paramB;
    }
}
