package com.polymorphism;

import com.util.Print;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/17 16:07
 * @Description:Glyh构造器的结果是对RoundGlyh.draw()方法的调用
 */
class Glyh{
    void draw(){
        print("Glyh.draw()");
    }
    Glyh(){
        print("Glyh() before draw()");
        draw();
        print("Glyh() after draw()");
    }
}
class RoundGlyh extends Glyh{
    private int radius =1;
    private boolean b = true;
    private Glyh glyh;
    RoundGlyh(int r){
        radius = r;
        print("RoundGlyh.RoundGlyh().radius = "+radius);
    }
    @Override
    void draw(){
        print("RoundGlyh.draw().radius = "+radius+
                " b = "+b+" glyh = "+glyh);
    }
}
public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyh(5);
    }
}
