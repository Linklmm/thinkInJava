package com.holding;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
    protected String[] words=("And that is how "+"we know the Earch to be banana-shaped,").split(" ");
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

            @Override
            public void remove() {
                //没有实现
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s:new IterableClass())
            System.out.println(s+" ");
    }
}
