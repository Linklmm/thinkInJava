package com.holding;

import java.util.Arrays;

public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib){
        for (T t:ib)
            System.out.println(t+" ");
    }

    public static void main(String[] args) {
        test(Arrays.asList(1,2,3));
        String[] strings={"A","B","C"};

        //尝试把一个数组当作一个Iterable参数传递会导致失败，这说明不存在任何从数组到Iterable的自动转换，你必须手工执行这种转换
        //test(strings);
        test(Arrays.asList(strings));
    }
}
