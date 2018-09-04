package com.generics;
class FixedSizeStack<T>{
    private int index=0;
    private Object[] storage;
    public FixedSizeStack(int size){
        storage=new Object[size];
    }
    //进栈
    public void push(T item){
        storage[index++]=item;
    }
    //出栈
    @SuppressWarnings("unchecked")
    public T pop(){
        return (T) storage[--index];
    }
}
public class GenericCast {
    public static final int SIZE=10;

    public static void main(String[] args) {
        FixedSizeStack<String> strings=new FixedSizeStack<String>(SIZE);
        for (String s:"A B C D E F G H I J".split(" "))
            strings.push(s);
        for (int i=0;i<SIZE;i++){
//            String s=strings.pop();
//            System.out.println(s);
            System.out.println(strings.pop());
        }
    }
}
