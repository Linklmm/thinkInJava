package com.containers;
import sun.nio.ch.Net;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author lmm
 * @Title: Stacks
 * @ProjectName thinkInJava
 * @Description: java 1.0/1.1的stack特性
 * @date 19-1-22下午2:47
 */
enum Month{
    JANUARY,FEBERUARY,MARCH,APRIL,MAY,JUNE,
    JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER
}
public class Stacks {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        for (Month m:Month.values()){
            stack.push(m.toString());
        }
        System.out.println("stack = "+stack);
        stack.addElement("The last line");
        System.out.println("element 5 = "+stack.elementAt(5));
        System.out.println("popping elements: ");
        while (!stack.empty()){
            System.out.println(stack.pop()+" ");
        }
        LinkedList<String> lstack = new LinkedList<String>();
        for (Month m :Month.values()){
            lstack.addFirst(m.toString());
        }
        System.out.println("lstack= "+lstack);
        while (!lstack.isEmpty()){
            System.out.println(lstack.removeFirst()+" ");
        }
    }
}
