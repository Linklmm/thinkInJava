package com.innerclasses;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/7/2 14:39
 * @Description:
 */
class Egg{
    private Yolk y;
    protected class Yolk{
        public Yolk(){
            print("Egg.Yolk()");
        }
    }
    public Egg(){
        print("New Egg");
        y = new Yolk();
    }
}
public class BigEgg extends Egg{
    public class Yolk{
        public Yolk(){
            print("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
