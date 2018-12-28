package com.containers;

import java.util.Random;

/**
 * @author lmm
 * @Title: Prediction
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 18-12-27下午5:40
 */
public class Prediction {
    private static Random rand = new Random(47);
    private boolean shadow = rand.nextDouble()>0.5;

    @Override
    public String toString() {
        if (shadow) {
            return "Six more weeks of winter\n";
        }else {
            return "Early Spring\n";
        }
    }
}
