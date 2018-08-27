package com.holding;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        for (String  s:"my dog has fleas".split(" ")){
            stack.push(s);//进栈
        }
        while (!stack.empty()){
            System.out.print(stack.pop()+" ");//出栈
        }
    }
}
