package com.polymorphism.shape;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/10 15:10
 * @Description:
 */
public class Square extends Shape {
    @Override
    public void draw() {
        print("Square.draw()");
    }

    @Override
    public void erase() {
        print("Square.erase()");
    }
}
