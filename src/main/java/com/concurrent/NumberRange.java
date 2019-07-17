package com.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-17 09:59
 * @Version 1.0
 * @Description 类并不足以保护她的不变性条件
 */
public class NumberRange {
    //不变性条件：lower<=upper
    private final AtomicInteger lower = new AtomicInteger(0);
    private final AtomicInteger upper = new AtomicInteger(0);

    public void setLower(int i) {
        //注意——不安全的"先检查后执行"
        if (i > upper.get()) {
            throw new IllegalStateException(
                    "can't set lower to " + i + " >upper");
        }
        lower.set(i);
    }

    public void setUpper(int i) {
        //注意——不安全的"先检查后执行"
        if (i < lower.get())
            throw new IllegalStateException(
                    "can't set upper to " + i + "<lower"
            );
        upper.set(i);
    }

    public boolean isInRange(int i) {
        return (i >= lower.get() && i <= upper.get());
    }
}
