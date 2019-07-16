package com.jdk8;

import org.junit.jupiter.api.Test;

public class TestLambda {
    public void op(long t1, long t2, MyFunction<Long, Long> mf) {
        System.out.println(mf.getValue(t1, t2));
    }

    @Test
    public void test() {
        op(100l, 200l, (x, y) -> x * y);
        op(1001l, 1002l, (x, y) -> x + y);
    }
}
