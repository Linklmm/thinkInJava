package com.containers;

/**
 * @author lmm
 * @Title: RandomBounds
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 19-1-19上午11:16
 */
public class RandomBounds {
    static void usage(){
        System.out.println("Usage");
        System.out.println("\tRandomBounds lower");
        System.out.println("\tRandomBounds upper");
        System.exit(1);
    }
    public static void main(String[] args){
        if (args.length !=1){
            usage();
        }
        if (args[0].equals("lower")){
            while (Math.random() != 0.0)
                ;
                System.out.println("produced 0.0");
        }else {
            usage();
        }
    }
}
