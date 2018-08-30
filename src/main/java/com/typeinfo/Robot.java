package com.typeinfo;

import java.util.List;

public interface Robot {
    String name();
    String model();
    List<Operation>  operations();
    class Test{
        public static void test(Robot r){
            if (r instanceof Null)
                System.out.println("[Null Robot]");
            System.out.println("Robot name: "+r.name());//Robot name: Slusher
            System.out.println("Robot model: "+r.model());//Robot model: SnowBot Series 11
            for (Operation operation:r.operations()){
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}
