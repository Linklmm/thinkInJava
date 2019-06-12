package com.reusing;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/5 15:04
 * @Description:
 */
class Insect{
    private int i =9;
    protected int j;
    Insect(){
        print("i = "+i+", j = "+j);
        j=39;
    }
    private static int x1 = printinit("static Insect.x1 initialized");
    static int printinit(String s){
        print(s);
        return 47;
    }
}
public class Beetle extends Insect{
    private int k = printinit("Beetle.k initialized");
    public Beetle(){
        print("k = "+k);
        print("j = "+j);
    }
    private static int x2 = printinit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b =new Beetle();
    }
}
