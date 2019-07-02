package com.innerclasses;

import static com.util.Print.print;
import static com.util.Print.printb;

/**
 * @Auther: linklmm
 * @Date: 2019/7/2 15:20
 * @Description:
 */
interface Counter{
    int next();
}
public class LocalInnerClass {
    private int count =0;
    Counter getCounter(final String name){
        //局部内部类
        class LocalCounter implements Counter {
            /*局部内部类可以有构造器*/
            public LocalCounter() {
                print("LocalCounter()");
            }

            @Override
            public int next() {
                printb(name);
                return count++;
            }
        }
        return new LocalCounter();
    }
    Counter getCounter2(final String name){
        /*匿名内部类*/
        return new Counter() {
            {
                print("Counter()");
            }
            @Override
            public int next() {
                printb(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic =new LocalInnerClass();
        Counter c1= lic.getCounter("Local inner"),
                c2 = lic.getCounter2("Anonymous inner");
        for (int i=0;i<5;i++)
            print(c1.next());
        for (int i=0;i<5;i++)
            print(c2.next());
    }
}
