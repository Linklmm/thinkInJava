package com.arrays;


import com.generics.Generator;

/**
 * @author lmm
 * @Title: GeneratorsTest
 * @ProjectName thinkInJava
 * @Description: 测试Generator的任何集合
 * @date 18-12-17下午5:34
 */
public class GeneratorsTest {
    public static int size =10;
    public static void test(Class<?> surroundingClass){
        for (Class<?> type: surroundingClass.getClasses()){
            System.out.print(type.getSimpleName()+" : ");
            try {
                Generator<?> g =(Generator<?>) type.newInstance();
                for (int i =0;i<size;i++){
                    System.out.print(g.next()+" ");
                }
                System.out.println();
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }

    }
    public static void main(String[] args){
    test(CountingGenerator.class);
    }
}
