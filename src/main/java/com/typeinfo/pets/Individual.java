package com.typeinfo.pets;

import com.sun.org.apache.xpath.internal.Arg;

/**
 * @author lmm
 * @Title: Individual
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 19-1-15下午5:38
 */
public class Individual implements Comparable<Individual> {
    private static long counter = 0;
    private final long id = counter++;
    private String name;
    public Individual(String name){
        this.name = name;
    }
    public Individual(){}

    @Override
    public String toString() {
        return getClass().getSimpleName()+(name ==null?"":" "+name);
    }
    public long getId(){
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Individual && id == ((Individual) obj).id;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (name!=null){
            result = 37*result+name.hashCode();
        }
        result = (int) (37*result+id);
        return result;
    }
    @Override
    public int compareTo(Individual o) {
        String first = getClass().getSimpleName();
        String argFirst = o.getClass().getSimpleName();
        int firstCompare = first.compareTo(argFirst);
        if (firstCompare != 0){
            return firstCompare;
        }
        if (name != null&& o.name != null){
            int secondCompare = name.compareTo(o.name);
            if (secondCompare != 0){
                return secondCompare;
            }
        }
        return (o.id < id ? -1 : (o.id == id ? 0 : 1));
    }
}
