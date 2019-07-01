package com.innerclasses;

/**
 * @Auther: linklmm
 * @Date: 2019/7/1 14:49
 * @Description:普通内部类的字段与方法，只能放在类的外部层次上，
 * 所以普通的内部类不能有static数据和static字段，也不能包含嵌套类。
 * 但是嵌套类可以包含所有这些东西。
 */
public class Parcel11 {
    private static class ParcelContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    protected static class ParcelDestination implements Destination{
        private String lable;
        private ParcelDestination(String lable){
            this.lable = lable;
        }
        @Override
        public String readLabel() {
            return lable;
        }
        public static void f(){}
        static int x = 10;
        static class AnotherLevel{
            public static void f(){}
            static int x =10;
        }
    }
//    public class ParcelDestination2 implements Destination{
//        private String lable;
//        private ParcelDestination2(String lable){
//            this.lable = lable;
//        }
//        @Override
//        public String readLabel() {
//            return lable;
//        }
//    }
    public static Destination destination(String s){
        return new ParcelDestination(s);
    }
//    public static Destination destination2(String s){
//        return new ParcelDestination2(s);
//    }
    public static Contents contents(){
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
        System.out.println(d.readLabel());
    }
}
