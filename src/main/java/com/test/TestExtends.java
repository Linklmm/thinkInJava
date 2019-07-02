package com.test;

/**
 * @Auther: linklmm
 * @Date: 2019/7/2 14:44
 * @Description:
 */
class TestA {
    public TestA() {
        System.out.println("testa");
    }
}

class TestB extends TestA{
    public TestB() {
        System.out.println("testb");
    }
}

public class TestExtends {
    public static void main(String[] args) {
        new TestB();
    }
}
