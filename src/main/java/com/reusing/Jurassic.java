package com.reusing;

//import static com.reusing.Dinosaur.i;

/**
 * @Auther: linklmm
 * @Date: 2019/6/5 14:17
 * @Description:final类
 */
class SmallBrain {
}

final class Dinosaur {
    //    static int i = 7;
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();

    void f() {
    }

    @Override
    public String toString() {
        return "Dinosaur{" +
                "i=" + i +
                ", j=" + j +
                ", x=" + x +
                '}';
    }
}

//class Further extends Dinosaur{}
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
//        i = 40;
        n.i = 40;
        n.f();
        n.j++;
        System.out.println(n);
    }
}
