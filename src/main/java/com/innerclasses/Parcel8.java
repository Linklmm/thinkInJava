package com.innerclasses;

/**
 * @Auther: linklmm
 * @Date: 2019/6/27 17:23
 * @Description:匿名内部类，被其导出类当作公共“接口”来使用
 */
public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            @Override
            public int value() {
                return super.value()*47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
        System.out.println(w.value());
    }
}
