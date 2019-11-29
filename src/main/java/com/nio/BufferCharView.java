package com.nio;

import java.nio.*;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-11-06 09:29
 * @Version 1.0
 * @Description 创建一个ByteBuffer的字符视图
 * 1byte = 1字节
 * char = 2字节
 * int = 4 字节
 * 新的 charBuffer = byte（总数）/char字节数 = 11/2 =5;
 * 新的 intBuffer =  byte(总数）/int字节数 = 11/4 =2;
 * 1*char = 2*byte
 * 1*int = 4*byte
 */
public class BufferCharView {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(11).order(ByteOrder.BIG_ENDIAN);
        CharBuffer charBuffer = byteBuffer.asCharBuffer();

        byteBuffer.put(0, (byte) 0);
        byteBuffer.put(1, (byte) 'H');
        byteBuffer.put(2, (byte) 0);
        byteBuffer.put(3, (byte) 'i');
        byteBuffer.put(4, (byte) 0);
        byteBuffer.put(5, (byte) '!');
        byteBuffer.put(6, (byte) 0);
        byteBuffer.put(7, (byte) 'c');
        byteBuffer.put(8, (byte) 0);
        byteBuffer.put(9, (byte) 'y');
        byteBuffer.put(10, (byte) 0);
//        byteBuffer.put(11, (byte) 'p');

//        ByteBuffer byteBuffer1 = ByteBuffer.allocate(7).order(ByteOrder.BIG_ENDIAN);
        IntBuffer intBuffer = byteBuffer.asIntBuffer();

        println(byteBuffer);
        println(charBuffer);
        println(intBuffer);
        System.out.println(intBuffer.get(0));
    }

    private static void println(Buffer buffer){
        System.out.println("pos="+buffer.position()
        +", limt = "+buffer.limit()
        +", capacity = "+buffer.capacity()
        +": '"+buffer.toString()+"'");
    }
}
