package com.polymorphism.music;

/**
 * @Auther: linklmm
 * @Date: 2019/6/5 16:07
 * @Description:
 */
public class Wind extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() "+n);
    }
}
