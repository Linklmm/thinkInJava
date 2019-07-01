package com.innerclasses;

/**
 * @Auther: linklmm
 * @Date: 2019/6/27 15:18
 * @Description:局部内部类，在方法的作用域内创建一个完整的类
 */
public class Parcel5 {
    public Destination destination(String s){
        /*PDestination类是destination方法的一部分*/
        class PDestination implements  Destination{
            private String label;
            private PDestination(String whereTo){
                label = whereTo;
            }
            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destination d = parcel5.destination("Tasmania");
        System.out.println(d.readLabel());
    }
}
