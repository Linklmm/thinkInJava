package com.strategy;

/**
 * @author lmm
 * @Title: Calc
 * @ProjectName thinkInJava
 * @Description: 进行计算操作的上下文环境
 * @date 19-1-31下午2:32
 */
public class Calc {
    private Strategy mStrategy;
    public void setStrategy(Strategy strategy) {
        this.mStrategy = strategy;
    }
    public double calc(double paramA, double paramB) {
        if (mStrategy == null) {
            throw new IllegalStateException("You haven't set the strategy for computing.");
        }
        return mStrategy.calc(paramA, paramB);
    }
}
