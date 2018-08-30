package com.typeinfo;

import java.util.Arrays;
import java.util.List;

public class ShowRemovalRobot implements Robot {
    private String name;
    public ShowRemovalRobot(String name){this.name=name;}//name=Slusher
    @Override
    public String name() {
        return name;
    }

    @Override
    public String model() {
        return "SnowBot Series 11";
    }

    @Override
    public List<Operation> operations() {
        return Arrays.asList(
                new Operation() {
                    @Override
                    public String description() {
                        return name + " can shovel snow";
                    }

                    @Override
                    public void command() {
                        System.out.println(name + " shoveling snow");
                    }
                },
                new Operation() {

                    @Override
                    public String description() {
                        return name + " can hip ice";
                    }

                    @Override
                    public void command() {
                        System.out.println(name + " chipping ice");
                    }
                },
                new Operation() {
                    @Override
                    public String description() {
                        return name+" can clear the roof";
                    }

                    @Override
                    public void command() {
                        System.out.println(name+" clearing roof");
                    }
                }
        );
    }

    public static void main(String[] args) {
        Robot.Test.test(new ShowRemovalRobot("Slusher"));
    }
}
