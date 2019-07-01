package com.innerclasses;

/**
 * @Auther: linklmm
 * @Date: 2019/6/28 14:28
 * @Description:匿名内部类，thinking in java中
 * 说编译器要求其参数引用是final的。
 */
public class Parcel9 {
    public Destination destination(final String dest){
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());
    }
}
