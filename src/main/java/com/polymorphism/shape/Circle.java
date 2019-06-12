package com.polymorphism.shape;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/10 15:08
 * @Description:
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }
}
