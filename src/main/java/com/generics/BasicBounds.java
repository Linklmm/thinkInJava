package com.generics;

import java.awt.*;

interface HasColor{Color getColor();}

class Colored<T extends HasColor>{
    T item;
    Colored(T item){this.item=item;}
    T getItem(){return item;}
    Color color(){return item.getColor();}
}

class Dimension{public int x=2,y=3,z=4;}

class ColoredDimension<T extends Dimension & HasColor>{
    T item;
    ColoredDimension(T item){this.item=item;}
    T getItem(){return item;}
    Color color(){return item.getColor();}
    int getX(){return item.x;}
    int getY(){return item.y;}
    int getZ(){return item.z;}
}
interface Weight{int weight();}

class Solid<T extends Dimension & HasColor &Weight>{
    T item;
    Solid(T item){this.item=item;}
    Color color(){return item.getColor();}
    int getX(){return item.x ;}
    int getY(){return item.y;}
    int getZ(){return item.z;}
    int weight(){return item.weight();}
}
class Bounded extends Dimension implements HasColor,Weight{

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}
public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid=new Solid<Bounded>(new Bounded());
        solid.color();
        solid.getY();
        solid.weight();
        System.out.println(solid.color());
        System.out.println(solid.getY());
        System.out.println(solid.weight());
    }
}
