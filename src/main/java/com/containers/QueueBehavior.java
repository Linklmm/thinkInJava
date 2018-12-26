package com.containers;

import com.generics.Generator;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author lmm
 * @Title: QueueBehavior
 * @ProjectName thinkInJava
 * @Description: queue实现的大部分操作的基本示例
 * todo
 * @date 18-12-26上午9:59
 */
public class QueueBehavior {
    private static int count = 10;
    static <T> void test(Queue<T> queue, Generator<T> gen){
        for (int i=0;i<count;i++){
            System.out.println("gen.next():" + gen.next());
            queue.offer(gen.next());
        }
        while (queue.peek() != null)
            System.out.println(queue.remove()+" ");
        System.out.println();
    }
    static class Gen implements Generator<String>{
        String[] s = ("one two three four five six seven"+" eight nine ten").split(" ");
        int i=0;
        @Override
        public String next() {
            return s[i++];
        }
    }
    public static void main(String[] args){
        test(new LinkedList<String>(),new Gen());
        test(new PriorityQueue<String>(),new Gen());
        test(new ArrayBlockingQueue<String>(count),new Gen());
        test(new ConcurrentLinkedDeque<String>(),new Gen());
        test(new LinkedBlockingDeque<String>(),new Gen());
        test(new PriorityBlockingQueue<String>(),new Gen());
    }
}
