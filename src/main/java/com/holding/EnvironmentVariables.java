package com.holding;

import java.util.Map;

public class EnvironmentVariables {
    public static void main(String[] args) {
        //system.getenv()返回一个Map，entrySet（）产生一个有map.entry的元素构成的Set
        for (Map.Entry entry:System.getenv().entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
