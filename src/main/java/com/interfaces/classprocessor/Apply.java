package com.interfaces.classprocessor;

import java.util.Arrays;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/22 09:21
 * @Description:完全解耦
 * 本例是一个策略设计模式：创建一个能够根据所传递的参数对象的不同
 * 而具有不同行为的方法，被称为策略模式
 *
 */
class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
}
class Upcase extends Processor{
    @Override
    String process(Object input){
        return ((String) input).toUpperCase();
    }
}
class Downcase extends Processor{
    @Override
    Object process(Object input) {
        return ((String) input).toLowerCase();
    }
}
class Splitter extends Processor{
    @Override
    Object process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
public class Apply {
    public static void process(Processor p,Object s){
        print("Using Processor "+p.name());
        print(p.process(s));
    }
    public static String s ="Disagreement with beliefs is by definition incorrent";
    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}
