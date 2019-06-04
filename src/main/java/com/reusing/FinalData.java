package com.reusing;

import java.util.Arrays;
import java.util.Random;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/4 15:39
 * @Description:
 */
class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Value{" +
                "i=" + i + " " + hashCode() +
                '}';
    }
}

public class FinalData {
    public static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VALUE3 = new Value(33);
    private static final Value VAL_3 = new Value(33);
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return "FinalData{" +
                "id='" + id + '\'' +
                ", valueOne=" + valueOne +
                ", i4=" + i4 +
                ", INT_5=" + INT_5 +
                ", v1=" + v1 +
                ", v2=" + v2 +
                ", a=" + Arrays.toString(a) +
                '}';
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }

//        fd1.v2 = new Value(0);
//        fd1.a = new int[3];
        print(fd1);
        print(VALUE3);
        fd1.v2.i++;
        VALUE3.i++;
        print(VALUE3);
        print("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        print(fd1);
        print(fd2);

    }
}
