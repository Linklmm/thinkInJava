package com.interfaces.interfaceprocessor;

import com.interfaces.filters.BandPass;
import com.interfaces.filters.HighPass;
import com.interfaces.filters.LowPass;
import com.interfaces.filters.Waveform;

/**
 * @Auther: linklmm
 * @Date: 2019/6/24 16:44
 * @Description:适配器模式
 */
public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),w);
        Apply.process(new FilterAdapter(new HighPass(2.0)),w);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),w);
    }
}
