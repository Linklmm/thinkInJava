package com.polymorphism.shape;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/10 15:14
 * @Description:
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }
}
