package com.innerclasses;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/28 14:37
 * @Description:通过实例初始化，让匿名内部类达到构造器的效果
 */
abstract class Base{
    public Base(int i){
        print("Base constructor , i = "+i);
    }
    public abstract void f();
}
public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i) {
            {print("Inside instance initializer");}
            @Override
            public void f() {
                print("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
