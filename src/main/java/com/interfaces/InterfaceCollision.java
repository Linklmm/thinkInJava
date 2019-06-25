package com.interfaces;

/**
 * @Auther: linklmm
 * @Date: 2019/6/25 17:02
 * @Description:
 */
interface I1{
    void f();
}
interface I2{
    int f(int i);
}
interface I3{
    int f();
}
class C{
    public int f(){
        return 1;
    }
}
class C2 implements I1,I2{
    @Override
    public void f() {

    }

    @Override
    public int f(int i) {
        return 1;
    }
}
class C3 extends C implements I2{
    @Override
    public int f(int i) {
        return 1;
    }
}
class C4 extends C implements I3{
    @Override
    public int f() {
        return 1;
    }
}
public class InterfaceCollision {
}
