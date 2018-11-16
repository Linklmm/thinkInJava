package com.arrays;
import java.util.Arrays;

public class MultidimentsionalObjectArrays {
    public static void main(String[] args) {
        BerylliumSphere[][] spheres={{new BerylliumSphere(),new BerylliumSphere()},
                {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()},
                {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),
                new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()}};
        System.out.println(Arrays.deepToString(spheres));
    }
}
