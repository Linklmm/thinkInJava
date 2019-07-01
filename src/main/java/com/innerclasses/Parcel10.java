package com.innerclasses;

/**
 * @Auther: linklmm
 * @Date: 2019/7/1 08:57
 * @Description:
 */
public class Parcel10 {
    public Destination destination(final String dest,final float price) {
        return new Destination() {
            private int cost;

            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget!");
                }
            }

            private String label = dest;

            @Override
            public String readLabel() {
                label ="have change"+price;
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
        System.out.println(d.readLabel());
    }
}
