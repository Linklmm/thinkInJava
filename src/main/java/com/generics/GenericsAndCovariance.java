package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<?extends Fruit> flist=new ArrayList<Apple>();
        //编译错误，不能添加任何类型对象到flist对象中
//        flist.add(new Apple());
//        flist.add(new Fruit());
//        flist.add(new Object());
        flist.add(null);
        Fruit f=flist.get(0);
    }
}
