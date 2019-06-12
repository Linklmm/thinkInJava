package com.polymorphism.music3;

import com.polymorphism.music.Note;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/10 17:20
 * @Description:
 */
class Instrument {
    void play(Note n) {
        print("Instrument.play()" + n);
    }
    String what(){
        return "Instrument";
    }
    void adjust(){
        print("Adjusting Instrument");
    }
}
class Wind extends Instrument{
    @Override
    void play(Note n) {
        print("Wind.play()" + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        print("Adjusting Wind");
    }
}
class Percussion extends Instrument{
    @Override
    void play(Note n) {
        print("Percussion.play()" + n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        print("Adjusting Percussion");
    }
}
class Stringed extends Instrument{
    @Override
    void play(Note n) {
        print("Stringed.play()" + n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        print("Adjusting Stringed");
    }
}
class Brass extends Wind{
    @Override
    void play(Note n) {
        print("Brass.play()" + n);
    }

    @Override
    void adjust() {
        print("Adjusting Brass");
    }
}
class Woodwind extends Wind{
    @Override
    void play(Note n) {
        print("Woodwind.play()" + n);
    }

    @Override
    String what() {
        return "Woodwind";
    }
}
public class Music3 {
    public static void tune(Instrument t){
        t.play(Note.MIDDLE_C);
        t.adjust();
    }
    public static void tuneAll(Instrument[] e){
        for (Instrument i :e){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra ={
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
