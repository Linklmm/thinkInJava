package com.test;

import java.io.Serializable;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-05 15:07
 * @Version 1.0
 * @Description 使用双重校验锁方式实现单例
 */
public class Singleton implements Serializable {
    private volatile static Singleton singleton;
    private Singleton(){}
    public static Singleton getSingleton(){

        if (singleton == null){
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
