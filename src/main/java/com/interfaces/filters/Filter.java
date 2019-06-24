package com.interfaces.filters;

/**
 * @Auther: linklmm
 * @Date: 2019/6/24 15:11
 * @Description:
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){
        return input;
    }
}
