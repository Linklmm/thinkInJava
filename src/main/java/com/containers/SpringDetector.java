package com.containers;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lmm
 * @Title: SpringDetector
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 18-12-28上午9:28
 */
public class SpringDetector {
    public static <T extends Groundinghog> void detectSpring(Class<T> type) throws Exception{
        Constructor<T> ghog = type.getConstructor(int.class);
        Map<Groundinghog,Prediction> map = new HashMap<Groundinghog,Prediction>();
        for (int i=0;i<10;i++){
            map.put(ghog.newInstance(i),new Prediction());
        }
        System.out.println("map = "+map);
        //这里实例的散列码和第一个实例的散列码不一样，故找不到键
        Groundinghog gh = ghog.newInstance(3);
        System.out.println("Looking up prediction for "+ gh);
        if (map.containsKey(gh)){
            System.out.println(map.get(gh));
        }else{
            System.out.println("Key not found: "+ gh);
        }
    }
    public static void main(String[] args) throws Exception {
        detectSpring(Groundinghog.class);
    }
}
