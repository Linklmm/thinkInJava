package com.polymorphism.shape;

import java.util.Random;

/**
 * @Auther: linklmm
 * @Date: 2019/6/10 15:15
 * @Description:
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next(){
        switch (rand.nextInt(3)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
