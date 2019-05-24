package com.initalization;

/**
 * @Auther: linklmm
 * @Date: 2019/5/23 15:49
 * @Description:可变参数列表
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47), new Float(3.14), new Double(11.11)
        });
        printArray(47, 3.14f, 11.11);
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new A(), new A(), new A()});
        printArray((Object[]) new Integer[]{
                1, 2, 3, 4
        });
        printArray();
    }
}
