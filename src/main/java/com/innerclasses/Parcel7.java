package com.innerclasses;

/**
 * @Auther: linklmm
 * @Date: 2019/6/27 16:16
 * @Description:匿名内部类
 */
public class Parcel7 {
    /*Contents 是一个接口*/
    public Contents contents(){
        return new Contents() {
            private int i =11;
            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
        System.out.println(c.value());
    }
}
