package com.containers;

/**
 * @author lmm
 * @Title: DequeTest
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 18-12-26下午3:16
 */
public class DequeTest {
    static void fillTest(Deque<Integer> deque){
        for (int i =20;i<27;i++){
            deque.addFirst(i);
        }
        for (int i =50;i<55;i++){
            deque.addLast(i);
        }
    }
    public static void main(String[] args){
        Deque<Integer> di = new Deque<Integer>();
        fillTest(di);
        System.out.println(di);
        while (di.size()!=0){
            System.out.print(di.removeFirst()+" ");
        }
        System.out.println();
        fillTest(di);
        while (di.size()!=0){
            System.out.print(di.removeLast()+" ");
        }
    }
}
