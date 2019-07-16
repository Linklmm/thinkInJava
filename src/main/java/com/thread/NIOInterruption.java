package com.thread;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SocketChannel;
import java.util.concurrent.*;

import static com.util.Print.print;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-16 15:51
 * @Version 1.0* @Description nio类进行非阻塞I/O操作
 */
class NIOBlocked implements Runnable{
    private final SocketChannel sc;

    public NIOBlocked(SocketChannel sc) {
        this.sc = sc;
    }

    @Override
    public void run() {
        try {
            print("Waiting for read() in " + this);
            sc.read(ByteBuffer.allocate(1));
        } catch (ClosedByInterruptException e) {
            print("ClosedByInterruptException");
        } catch (AsynchronousCloseException e) {
            print("AsynchronousCloseException");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        print("Exiting NIOBlocked.run() " + this);
    }

}
public class NIOInterruption  {
    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        ServerSocket server=new ServerSocket(8080);
        InetSocketAddress isa =new  InetSocketAddress("localhost",8080);
        SocketChannel s1 = SocketChannel.open(isa);
        SocketChannel s2 = SocketChannel.open(isa);
        //使用submit调用
        Future<?> f = exec.submit(new NIOBlocked(s1));
        exec.execute(new NIOBlocked(s2));
        exec.shutdown();
        TimeUnit.SECONDS.sleep(1);
        f.cancel(true);
        TimeUnit.SECONDS.sleep(1);
        s2.close();
    }
}
