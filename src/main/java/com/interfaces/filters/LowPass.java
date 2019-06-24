package com.interfaces.filters;

/**
 * @Auther: linklmm
 * @Date: 2019/6/24 15:13
 * @Description:
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
