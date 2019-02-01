package com.strategy;

/**
 * @author lmm
 * @Title: DivStrategy
 * @ProjectName thinkInJava
 * @Description: 除法的具体实现策略
 * @date 19-1-31下午2:30
 */
public class DivStrategy implements Strategy {
    @Override
    public double calc(double paramA, double paramB) {
        System.out.println("Execute DivStrategy");
        if (paramB == 0) {
            throw new IllegalArgumentException("Cannot divide into 0");
        }
        return paramA / paramB;
    }
}
