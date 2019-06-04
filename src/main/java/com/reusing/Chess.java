package com.reusing;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/3 17:42
 * @Description:
 */
public class Chess extends BoardGame {
    Chess() {
        super(11);
        print("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
