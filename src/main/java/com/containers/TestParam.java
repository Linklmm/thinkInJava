package com.containers;

import java.util.List;

/**
 * @author lmm
 * @Title: TestParam
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 19-1-16上午9:02
 */
public class TestParam {
    public final int size;
    public final int loops;
    public TestParam(int size,int loops){
        this.size = size;
        this.loops = loops;
    }
    //通过可变参数列表产生一个TestParam数组
    public static TestParam[] array(int... values){
        int size = values.length/2;
        TestParam[] result = new TestParam[size];
        int n = 0;
        for (int i =0 ;i<size;i++){
            result[i] = new TestParam(values[n++],values[n++]);
        }
        return result;
    }
    //通过一个string数组产生一个TestParam数组,值都在String当中
    public static TestParam[] array(String[] values){
        int[] vals = new int[values.length];
        for (int i =0;i<vals.length;i++){
            vals[i] = Integer.decode(values[i]);
        }
        return array(vals);
    }
}
