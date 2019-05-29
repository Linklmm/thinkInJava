package com.initalization;

/**
 * @Auther: linklmm
 * @Date: 2019/5/24 14:40
 * @Description:
 */
public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }

}
