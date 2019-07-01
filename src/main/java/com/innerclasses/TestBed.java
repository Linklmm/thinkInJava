package com.innerclasses;

/**
 * @Auther: linklmm
 * @Date: 2019/7/1 15:28
 * @Description:
 */
public class TestBed {
    public void f(){
        System.out.println("f()");
    }
    public static class Tester{
        public static void main(String[] args) {
            TestBed testBed = new TestBed();
            testBed.f();
        }
    }
}
