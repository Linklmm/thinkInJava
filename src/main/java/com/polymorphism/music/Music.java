package com.polymorphism.music;

/**
 * @Auther: linklmm
 * @Date: 2019/6/5 16:08
 * @Description:
 */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
