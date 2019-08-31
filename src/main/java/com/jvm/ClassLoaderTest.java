package com.jvm;

import java.io.IOException;
import java.io.InputStream;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-27 08:23
 * @Version 1.0
 * @Description 类加载器与Instanceof关键字演示
 */
public class ClassLoaderTest {
    public static void main(String[] args)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".")+1)+".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null){
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name,b,0,b.length);
                } catch (IOException e) {
                    throw  new ClassNotFoundException();
                }
            }
        };

        Object obj = myLoader.loadClass("com.jvm.ClassLoaderTest").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof  com.jvm.ClassLoaderTest);
    }
}
