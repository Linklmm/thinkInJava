package com.containers;

import java.util.*;

/**
 * @author lmm
 * @Title: SetPerformance
 * @ProjectName thinkInJava
 * @Description: set的性能测试表
 * @date 19-1-19上午11:22
 */
public class SetPerformance {
    static List<Test<Set<Integer>>> tests = new ArrayList<Test<Set<Integer>>>();

    static {
        tests.add(new Test<Set<Integer>>("add") {
            @Override
            int test(Set<Integer> container, TestParam tp) {
                int loops = tp.loops;
                int size = tp.size;
                for (int i = 0; i < loops; i++) {
                    container.clear();
                    for (int j = 0; j < size; j++) {
                        container.add(j);
                    }
                }
                return loops * size;
            }
        });
        tests.add(new Test<Set<Integer>>("contains") {
            @Override
            int test(Set<Integer> container, TestParam tp) {
                int loops = tp.size;
                int span = tp.size*2;
                for (int i =0;i<loops;i++){
                    for (int j= 0;j<span;j++){
                        container.contains(j);
                    }
                }
                return loops*span;
            }
        });
        tests.add(new Test<Set<Integer>>("iterate") {
            @Override
            int test(Set<Integer> container, TestParam tp) {
                int loops = tp.loops*10;
                for (int i =0;i<loops;i++){
                    Iterator<Integer> it = container.iterator();
                    while (it.hasNext()){
                        it.next();
                    }
                }
                return loops*container.size();
            }
        });
    }
    public static void main(String[] args){
        if (args.length>0){
            Tester.defaultParams = TestParam.array(args);
        }
        Tester.fieldWidth = 10;
        Tester.run(new TreeSet<Integer>(),tests);
        Tester.run(new HashSet<Integer>(),tests);
        Tester.run(new LinkedHashSet<Integer>(),tests);
    }
}
