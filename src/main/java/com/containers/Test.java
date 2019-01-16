package com.containers;

/**
 * @author lmm
 * @Title: Test
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 19-1-16上午8:58
 */
public abstract class Test<C> {
    String name;
    public Test(String name){
        this.name = name;
    }
    //不同的测试重写这个方法
    abstract int test(C container,TestParam tp);
}
