package com.interfaces.interfaceprocessor;

/**
 * @Auther: linklmm
 * @Date: 2019/6/24 15:52
 * @Description:
 */
public interface Processor {
    String name();
    Object process(Object input);
}
