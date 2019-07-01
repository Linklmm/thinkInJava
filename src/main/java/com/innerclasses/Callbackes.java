package com.innerclasses;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/7/1 16:40
 * @Description:通过内部类提供的闭包功能实现回调
 */
interface Incrementable {
    void increment();
}

class Callee1 implements Incrementable {
    private int i = 0;

    @Override
    public void increment() {
        i++;
        print(i);
    }
}

class MyIncrement {
    public void increment() {
        print("Other operation");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}

class Callee2 extends MyIncrement {
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        print(i);
//        super.increment();
    }

    /**
     * 内部类
     * 返回Callee2的“钩子”
     */
    private class Closure implements Incrementable {
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference() {
        return new Closure();
    }
}

/**
 * caller的构造器需要一个Incrementable的引用作为参数（虽然可以
 * 在任意时刻捕获回调引用），然后在以后的某个时刻，Caller对象可以
 * 使用此引用回调Callee类
 */
class Caller {
    private Incrementable callbackReference;

    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }

    void go() {
        callbackReference.increment();
    }
}

public class Callbackes {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        /**
         * Other operation
         * 1
         */
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        /**
         * 调用c2的getCallbackReference方法得到Closure
         */
        Caller caller2 = new Caller(c2.getCallbackReference());
        /**
         * 1
         */
        caller1.go();
        /**
         * 1
         */
        caller1.go();
        /**
         * Other operation
         * 2
         */
        caller2.go();
        /**
         * Other operation
         * 3
         */
        caller2.go();
    }
}
