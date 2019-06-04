package com.reusing;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/3 16:45
 * @Description:
 */
class Cleanser{
    private String s = "Cleanser";
    public void append(String a){
        s += a;
    }
    public void dilute(){
        append(" dilute()");
    }
    public void apply(){
        append(" apply()");
    }
    public void scrub(){
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        print(x);
    }
}
public class Detergent extends Cleanser{
    @Override
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foma(){
        append(" foma()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foma();
        print(x);
        print("Testing base class: ");
        Cleanser.main(args);
    }
}
