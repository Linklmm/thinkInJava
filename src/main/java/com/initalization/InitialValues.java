package com.initalization;

/**
 * @Auther: linklmm
 * @Date: 2019/5/16 14:31
 * @Description:类的基本类型数据成员的初始值
 */
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
    void printInitialValue(){
        System.out.println("Data type  Initial value");
        System.out.println("boolean "+t);
        System.out.println("char ["+c+"]");
        System.out.println("byte "+b);
        System.out.println("short "+s);
        System.out.println("int "+i);
        System.out.println("long "+l);
        System.out.println("float "+f);
        System.out.println("double "+d);
        System.out.println("reference "+reference);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValue();
    }
}
