package com.polymorphism;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/12 17:06
 * @Description:
 */
class Meal{
//    private Bread b = new Bread();
    public Meal() {
        print("Meal()");
    }
//    private Bread b = new Bread();
}
class Bread{
    public Bread() {
        print("Bread()");
    }
}
class Cheese{
    public Cheese() {
        print("Cheese()");
    }
}
class Lettuce{
    public Lettuce() {
        print("Lettuce()");
    }
}
class Lunch extends Meal{
    public Lunch() {
        print("Lunch()");
    }
}
class PortableLunch extends Lunch{
    public PortableLunch() {
        print("PortableLunch()");
    }
}
public class Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich(){
        print("Sandwich()");
    }

    public static void main(String[] args) {
        Sandwich s = new Sandwich();
    }
}
