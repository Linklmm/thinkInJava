package com.interfaces.interfaceprocessor;

import com.interfaces.filters.Filter;
import com.interfaces.filters.Waveform;

/**
 * @Auther: linklmm
 * @Date: 2019/6/24 16:40
 * @Description:适配器设计模式，
 * 适配器中的代码将接受你所拥有的接口，
 * 并产生你所需要的接口
 */
public class FilterAdapter implements Processor{
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Object process(Object input) {
        return filter.process((Waveform)input);
    }
}
