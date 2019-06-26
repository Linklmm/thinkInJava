package com.interfaces;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/26 11:39
 * @Description:工厂方法设计模式
 */
interface Service{
    void method1();
    void method2();
}
interface ServiceFactory{
    Service getService();
}
class Implementation1 implements Service{
    Implementation1(){}
    @Override
    public void method1() {
        print("Implementation1 method1");
    }

    @Override
    public void method2() {
        print("Implementation1 method2");
    }
}
class Implementation1Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation1();
    }
}
class Implementation2 implements Service{
    public Implementation2() {
    }

    @Override
    public void method1() {
        print("Implementation2 method1");
    }

    @Override
    public void method2() {
        print("Implementation2 method2");
    }
}
class Implementation2Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation2();
    }
}
public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation2Factory());
        serviceConsumer(new Implementation1Factory());
    }
}
