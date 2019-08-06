package com.test;

import sun.misc.IOUtils;

import java.io.*;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-08-05 14:43
 * @Version 1.0
 * @Description 一个类要想被序列化必须实现Serializable接口
 */
public class SerializableDemo1 {
    public static void main(String[] args) {
        User user = new User("gwj",23);
        System.out.println(user);

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }

        File file = new File("tempFile");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("tempFile"));
            User newUser = (User) ois.readObject();
            System.out.println(newUser);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
