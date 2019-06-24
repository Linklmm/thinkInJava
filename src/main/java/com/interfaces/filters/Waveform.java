package com.interfaces.filters;

/**
 * @Auther: linklmm
 * @Date: 2019/6/24 15:10
 * @Description:
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform "+id;
    }
}
