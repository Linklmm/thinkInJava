package com.innerclasses;

/**
 * @Auther: linklmm
 * @Date: 2019/7/2 14:22
 * @Description:
 */
class WithInner{
    public WithInner() {
        System.out.println("WithInner constructor");
    }

    class Inner{
    }
}
public class InheriInner extends WithInner.Inner {
//    InheriInner(){}
    InheriInner(WithInner wi){
        wi.super();
        System.out.println("InheriInner constructor");
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheriInner ii = new InheriInner(wi);
    }
}
