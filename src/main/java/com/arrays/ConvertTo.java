package com.arrays;

/**
 * 版权声明：Copyright(c) 2018
 *
 * @program: ThreadTest
 * @Author minmin.liu
 * @Date 2018-12-18 17:07
 * @Version 1.0
 * @Description 它可以接收任意的包装器对象数组，并将其转换为相应的基本类型数组
 */
public class ConvertTo {
    public static boolean[] primitive(Boolean[] in){
        boolean [] result = new boolean[in.length];
        for (int i=0;i<in.length;i++){
            result[i] = in[i];
        }
        return result;
    }
    public static char[] primitive(Character[] in){
        char[] result = new char[in.length];
        for (int i=0;i<in.length;i++){
            result[i] = in[i];
        }
        return result;
    }
    public static byte[] primitive(Byte[] in){
        byte[] result = new byte[in.length];
        for (int i=0;i<in.length;i++){
            result[i] = in[i];
        }
        return result;
    }
    public static short[] primitive(Short[] in){
        short[] result = new short[in.length];
        for (int i=0;i<in.length;i++){
            result[i] = in[i];
        }
        return result;
    }
    public static int[] primitive(Integer[] in){
        int[] result = new int[in.length];
        for (int i=0;i<in.length;i++){
            result[i] = in[i];
        }
        return result;
    }
    public static long[] primitive(Long[] in){
        long[] result = new long[in.length];
        for (int i=0;i<in.length;i++){
            result[i] = in[i];
        }
        return result;
    }
    public static float[] primitive(Float[] in){
        float[] result = new float[in.length];
        for (int i=0;i<in.length;i++){
            result[i] = in[i];
        }
        return result;
    }
    public static double[] primitive(Double[] in){
        double[] result = new double[in.length];
        for (int i=0;i<in.length;i++){
            result[i] = in[i];
        }
        return result;
    }
}
