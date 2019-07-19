package com.concurrent;

import java.math.BigInteger;

/**
 * @Auther: linklmm
 * @Date: 2019/7/19 09:57
 * @Description:
 */
public class ExpensiveFunction implements Computable<String,BigInteger> {
    @Override
    public BigInteger compute(String arg) throws InterruptedException {
        return new BigInteger(arg);
    }
}
