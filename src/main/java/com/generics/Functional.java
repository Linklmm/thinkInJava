package com.generics;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

interface Combiner<T>{T combine(T x, T y);}
interface UnaryFunction<R,T>{R functiion(T x);}
interface Collector<T> extends  UnaryFunction<T,T>{
    T result();
}
interface UnaryPredicate<T>{boolean test(T x);}

public class Functional {
    public static <T> T reduce(Iterable<T> seq,Combiner<T> combiner){
        Iterator<T> it=seq.iterator();
        if (it.hasNext()){
            T result=it.next();
            //System.out.println(result);
            while (it.hasNext()){
                //System.out.println(it.next());
            //T result2=it.next();
            //System.out.println(result2);
                result=combiner.combine(result,it.next());}
            return result;
        }
        return null;
     }
     public static <T> Collector<T> forEach(Iterable<T> seq,Collector<T> func){
        for (T t:seq)
            func.functiion(t);
        return func;
     }
     public static <R,T>List<R> transform(Iterable<T> seq,UnaryFunction<R,T> func){
        List<R> result=new ArrayList<R>();
        for (T t:seq)
            result.add(func.functiion(t));
        return result;
     }

     public static <T> List<T> filter(Iterable<T> seq,UnaryPredicate<T> pred){
        List<T> result=new ArrayList<T>();
        for (T t:seq)
            if (pred.test(t))
                result.add(t);
        return result;
     }
     static class IntegerAdder implements Combiner<Integer>{
        public Integer combine(Integer x,Integer y){
            return x+y;
        }
     }
     static class IntegerSubtracter implements Combiner<Integer>{
         @Override
         public Integer combine(Integer x, Integer y) {
             return x-y;
         }
     }
     static class BigDecimalAdder implements Combiner<BigDecimal>{
         @Override
         public BigDecimal combine(BigDecimal x, BigDecimal y) {
             return x.add(y);
         }
     }
     static class BigIntegerAdder implements Combiner<BigInteger>{
         @Override
         public BigInteger combine(BigInteger x, BigInteger y) {
             return x.add(y);
         }
     }
     static class AtomicLongAdder implements Combiner<AtomicLong>{
         @Override
         public AtomicLong combine(AtomicLong x, AtomicLong y) {
             return new AtomicLong(x.addAndGet(y.get()));
         }
     }
     static class BigDecimalUlp implements UnaryFunction<BigDecimal,BigDecimal>{
         @Override
         public BigDecimal functiion(BigDecimal x) {
             return x.ulp();
         }
     }

     static class GreaterThan<T extends Comparable<T>> implements UnaryPredicate<T>{
        private T bound;
        public GreaterThan(T bound){this.bound=bound;}
        public boolean test(T x){return x.compareTo(bound)>0;}
     }
     static class MultiplyingIntegerCollector implements Collector<Integer>{
        private Integer val=1;

         @Override
         public Integer functiion(Integer x) {
             val *=x;
             return val;
         }

         @Override
         public Integer result() {
             return val;
         }
     }

    public static void main(String[] args) {
        List<Integer> li=Arrays.asList(1,2,3,4,5,6,7);
        Integer result=reduce(li,new IntegerAdder());
        System.out.println(result);//相加

        result=reduce(li,new IntegerSubtracter());
        System.out.println(result);//相减

        System.out.println(filter(li,new GreaterThan<Integer>(4)));//大于4的元素

        System.out.println(forEach(li,new MultiplyingIntegerCollector()).result());//相乘

        System.out.println(forEach(filter(li,new GreaterThan<Integer>(4)),new MultiplyingIntegerCollector()).result());//大于4的元素相乘

        MathContext mc=new MathContext(7);//保留7为有效数字
        //System.out.println(new BigDecimal(15.555555555555,mc));
        List<BigDecimal> lbd=Arrays.asList(new BigDecimal(1.1,mc),new BigDecimal(2.2,mc),new BigDecimal(3.3,mc),new BigDecimal(4.4,mc));
        BigDecimal rbd=reduce(lbd,new BigDecimalAdder());
        System.out.println(rbd);//相加

        System.out.println(filter(lbd,new GreaterThan<BigDecimal>(new BigDecimal(3))));//大于3的元素

        List<BigInteger> lbi=new ArrayList<BigInteger>();
        BigInteger bi=BigInteger.valueOf(11);
        for (int i=0;i<11;i++){
            lbi.add(bi);
            bi=bi.nextProbablePrime();//得到质数
        }
        System.out.println(lbi);

        BigInteger rbi=reduce(lbi,new BigIntegerAdder());
        System.out.println(rbi);//相加
        System.out.println(rbi.isProbablePrime(5));

        List<AtomicLong> lal=Arrays.asList(new AtomicLong(11),new AtomicLong(47),new AtomicLong(74),new AtomicLong(133));
        AtomicLong ral=reduce(lal,new AtomicLongAdder());//相加
        System.out.println(ral);

        System.out.println(transform(lbd,new BigDecimalUlp()));
    }
}

