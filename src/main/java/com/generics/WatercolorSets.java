package com.generics;
import com.generics.Sets.*;
import java.util.EnumSet;
import java.util.Set;

public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1=EnumSet.range(Watercolors.BRILLIANT_RED,Watercolors.VIRIDIAN_HUE);//EnumSet.range()传入某个范围的第一个元素与最后一个元素，然后它将返回一个set，其中包含该范围内的所有元素
        Set<Watercolors> set2=EnumSet.range(Watercolors.CERULEAN_BLUE_HUE,Watercolors.BURNT_UMBER);
        System.out.println("set1:"+set1);
        System.out.println("set2:"+set2);
        System.out.println("union(set1,set2): "+com.generics.Sets.union(set1,set2));
        Set<Watercolors> subset=com.generics.Sets.intersection(set1,set2);
        System.out.println("intersection(set1,set2): "+subset);
        System.out.println("difference(set2,subset): "+com.generics.Sets.difference(set2,subset));
        System.out.println("complement(set1,set2): "+com.generics.Sets.complement(set1,set2));
    }
}
