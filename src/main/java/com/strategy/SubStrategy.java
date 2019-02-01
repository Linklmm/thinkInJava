package com.strategy;

/**
 * @author lmm
 * @Title: SubStrategy
 * @ProjectName thinkInJava
 * @Description: 减法的具体实现策略
 * @date 19-1-31下午2:28
 */
public class SubStrategy implements Strategy {
    @Override
    public double calc(double paramA, double paramB) {
        System.out.println("Execute SubStrategy");
        return paramA - paramB;
    }
}
