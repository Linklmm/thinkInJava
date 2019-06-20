package com.polymorphism;

/**
 * @Auther: linklmm
 * @Date: 2019/6/20 16:44
 * @Description:向下转型与运行时类型识别
 */
class Useful{
    public void f(){}
    public void g(){}
}
class MoreUseful extends Useful{
    @Override
    public void f() {
    }
    @Override
    public void g() {
    }
    public void u(){}
    public void v(){}
    public void w(){}
}
public class RTTI {
    public static void main(String[] args) {
        Useful[] x={
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].f();
//        x[1].u();
        ((MoreUseful)x[1]).u();
        ((MoreUseful)x[0]).u();//java.lang.ClassCastException: com.polymorphism.Useful cannot be cast to com.polymorphism.MoreUseful
    }
}
