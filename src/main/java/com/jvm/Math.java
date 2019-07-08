package com.jvm;

public class Math {
    public static final Integer CONSTANT=666;
    public int compute(){
        int a=1;
        int b=2;
        int c = (a+b)*10;
        return c;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.compute();
    }
}
