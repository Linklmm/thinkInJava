package com.generics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import static com.generics.Tuple.*;

/**
 * @author linklmm
 * 与动态代理混合
 * */
class MixinProxy implements InvocationHandler{
    Map<String,Object> delegatesByMethod;

    public MixinProxy(TwoTuple<Object,Class<?>>... pairs){
        delegatesByMethod=new HashMap<String,Object>();

        for (TwoTuple<Object,Class<?>> pair:pairs){
            //System.out.println(pair);
            //将方法名作键，接口实现类为值
            for (Method method:pair.second.getMethods()){
                String methodName=method.getName();
                if (!delegatesByMethod.containsKey(methodName))
                    delegatesByMethod.put(methodName,pair.first);
            }
        }
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName=method.getName();
        System.out.println(methodName);
        //System.out.println(delegatesByMethod.get(methodName));
        Object delegate=delegatesByMethod.get(methodName);
        return method.invoke(delegate,args);
    }
    //得到传入对象的各个方法
    @SuppressWarnings("unchecked")
    public static Object newInstance(TwoTuple... pairs){
        Class[] interfaces=new Class[pairs.length];
        //System.out.println(pairs.length);
        for (int i=0;i<pairs.length;i++){
            //System.out.println(pairs[i]);
            //得到Class对象
            interfaces[i]= (Class) pairs[i].second;}
            //得到代理对象
            ClassLoader cl=pairs[0].first.getClass().getClassLoader();
        return Proxy.newProxyInstance(cl,interfaces,new MixinProxy(pairs));
    }
}
public class DynamicProxyMixin {
    public static void main(String[] args) {
        Object mixin=MixinProxy.newInstance(tuple(new BasicImp(),Basic.class),
                tuple(new TimeStampedImp(),TimeStamped.class),
                tuple(new SerialNumberedImp(),SerialNumbered.class));
        Basic b= (Basic) mixin;
        TimeStamped t= (TimeStamped) mixin;
        SerialNumbered s= (SerialNumbered) mixin;
        b.set("hello");
        System.out.println(b.get());
        System.out.println(t.getStamp());
        System.out.println(s.getSerialNumber());
    }
}
