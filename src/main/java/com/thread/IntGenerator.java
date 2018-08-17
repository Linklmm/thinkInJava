package com.thread;

public abstract class IntGenerator {
    //cancelde标志
    private volatile boolean canceled=false;
    //可以产生一系列偶数值
    public abstract int next();
    public void cancel(){canceled=true;}
    //可以查看该对象是否已经被取消
    public boolean isCanceled(){return canceled;}
}
