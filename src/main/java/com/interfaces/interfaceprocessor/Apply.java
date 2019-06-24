package com.interfaces.interfaceprocessor;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/24 15:52
 * @Description:
 */
public class Apply {
    public static void process(Processor p ,Object s){
        print("Using Processor "+p.name());
        print(p.process(s));
    }
}
