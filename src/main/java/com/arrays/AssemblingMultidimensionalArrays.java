package com.arrays;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class AssemblingMultidimensionalArrays {
    public static void main(String[] args) {
        Integer[][] a;
        a=new Integer[3][];
        for (int i=0;i<a.length;i++){
            a[i]=new Integer[3];
            System.out.println(Arrays.deepToString(a));
            for (int j=0;j<a.length;j++){
                a[i][j]=i*j;
            }
        }
        System.out.println(Arrays.deepToString(a));

        Long timestamp= new Long(System.currentTimeMillis());
        System.out.println("timestamp"+timestamp);
        System.out.println(timestamp/1000/3600);
        System.out.println(Calendar.getInstance().getTimeInMillis() / 1000);
        Date date=new Date();
        System.out.println(date);
    }
}
