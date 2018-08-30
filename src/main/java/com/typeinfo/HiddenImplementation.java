package com.typeinfo;

import com.typeinfo.interfacea.A;
import com.typeinfo.packageaccess.HiddenC;

import java.lang.reflect.Method;

public class HiddenImplementation {
    public static void main(String[] args) throws Exception{
        A a=HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());

        callHiddenMethod(a,"g");
        callHiddenMethod(a,"u");
        callHiddenMethod(a,"v");
        callHiddenMethod(a,"w");
    }
    //得到隐藏的方法
    static void callHiddenMethod(Object a,String methodName) throws Exception {
        Method g=a.getClass().getDeclaredMethod(methodName);//得到对象的方法名
        //System.out.println(g);
        g.setAccessible(true);// g.setAccessible(true);得作用就是让我们在用反射时访问私有变量
        g.invoke(a);//调用a对象里面的g方法。Method.invoke(Object)返回Object.Method()结果
    }
}
