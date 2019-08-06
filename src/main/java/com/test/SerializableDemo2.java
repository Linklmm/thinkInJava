package com.test;

import java.io.*;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-05 15:11
 * @Version 1.0
 * @Description 序列化对单例模式的破坏
 */
public class SerializableDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        oos.writeObject(Singleton.getSingleton());
        File file = new File("tempFile");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tempFile"));
        Singleton newInstance = (Singleton) ois.readObject();
        System.out.println(newInstance == Singleton.getSingleton());
    }
}
