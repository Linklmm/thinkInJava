package com.concurrent;

import com.typeinfo.interfacea.A;

/**
 * @Auther: linklmm
 * @Date: 2019/7/19 08:53
 * @Description:使用HashMap和同步机制来初始化缓存
 */
public interface Computable<A,V> {
    V compute(A arg) throws InterruptedException;
}
