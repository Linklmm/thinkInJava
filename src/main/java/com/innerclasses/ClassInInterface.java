package com.innerclasses;

/**
 * @Auther: linklmm
 * @Date: 2019/7/1 15:25
 * @Description:接口内部类
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{
        @Override
        public void howdy() {
            System.out.println("Howdy");
        }
    }

    public static void main(String[] args) {
        new Test().howdy();
    }
}
