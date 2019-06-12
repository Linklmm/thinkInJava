package com.polymorphism;

import com.polymorphism.shape.RandomShapeGenerator;
import com.polymorphism.shape.Shape;

/**
 * @Auther: linklmm
 * @Date: 2019/6/10 15:17
 * @Description:
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i=0;i<s.length;i++){
            s[i]=gen.next();
        }
        for (Shape shp:s){
            shp.draw();
        }
    }
}
