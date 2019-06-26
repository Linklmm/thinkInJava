package com.innerclasses;

/**
 * @Auther: linklmm
 * @Date: 2019/6/26 17:13
 * @Description:创建外部类的内部类对象
 */
public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
