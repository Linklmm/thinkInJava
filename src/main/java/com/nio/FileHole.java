package com.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-11-14 09:03
 * @Version 1.0
 * @Description 文件空洞
 */
public class FileHole {
    public static void main(String[] args) throws IOException {
        File temp = File.createTempFile("holy",null);
        RandomAccessFile file = new RandomAccessFile(temp,"rw");
        FileChannel channel = file.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
        putData(0,byteBuffer,channel);
        putData(5000000,byteBuffer,channel);
        putData(50000,byteBuffer,channel);
        System.out.println("Wrote temp file '"+temp.getPath()+"',size="+channel.size());
    }
    private static void putData(int position,ByteBuffer buffer,FileChannel channel)
            throws IOException {
        String string = "*<-- location "+position;
        buffer.clear();
        buffer.put(string.getBytes("utf-8"));
        buffer.flip();
        channel.position(position);
        channel.write(buffer);
    }
}
