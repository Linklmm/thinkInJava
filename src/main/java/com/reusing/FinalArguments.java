package com.reusing;

/**
 * @Auther: linklmm
 * @Date: 2019/6/4 16:11
 * @Description:
 */
class Gizmo{
    public void spin(){}
}
public class FinalArguments {
    void with(final Gizmo g){
//        g = new Gizmo();
        g.spin();
    }
    void without(Gizmo g){
        g = new Gizmo();
        g.spin();
    }
//    void f(final int i){
//        i++;
//    }
    int f(final int i){
        return i+1;
    }
}
