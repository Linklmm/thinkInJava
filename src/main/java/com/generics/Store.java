package com.generics;

import java.util.ArrayList;
import java.util.Random;
/**
 * 每个类都是作为一个构建块创建，但是整个还是包含许多部分
 * @author linklmm
 * */
class Product{
    private final int id;
    private String description;
    private double price;
    public Product(int IDnumber,String descr,double price){
        id=IDnumber;
        description=descr;
        this.price=price;
        //System.out.println(toString());
    }

    @Override
    public String toString() {
        return id+": "+description+", price: $"+price;
    }
    //改变价格，在原有的基础上增减价格
    public void priceChange(double change){
        price+=change;
    }
    //生成product对象
    public static Generator<Product> generator=new Generator<Product>() {
        private Random random=new Random(47);
        @Override
        public Product next() {
            return new Product(random.nextInt(1000),"Test",Math.round(random.nextDouble()*1000.0)+0.99);
        }
    };
}
class Shelf extends ArrayList<Product>{
    public Shelf(int nProducts){
        //得到nProducts个product并将其加入到Shelt中
        //System.out.println(this);
        Generators.fill(this,Product.generator,nProducts);
    }
}
class Aisle extends ArrayList<Shelf>{
    public Aisle(int nShelves,int nProducts){
        //得到nshelves个 Shelf
        for (int i=0;i<nShelves;i++){
            add(new Shelf(nProducts));
        }
    }
}
class CheckoutStand{}
class Office{}
public class Store extends ArrayList<Aisle> {
    private ArrayList<CheckoutStand> checkouts=new ArrayList<CheckoutStand>();
    private Office office=new Office();
    //得到nAisle个Aisle
    public Store(int nAisles,int nShelves,int nProducts){
        for (int i=0;i<nAisles;i++)
            add(new Aisle(nShelves,nProducts));
    }

    @Override
    public String toString() {
        StringBuilder result=new StringBuilder();
        for (Aisle a:this)
            for (Shelf s:a)
                for (Product p:s){
            result.append(p);
            result.append("\n");
                }
                return result.toString();
    }

    public static void main(String[] args) {
        //得到nAisles*nShelves*nProducts 的store对象
        System.out.println(new Store(2,5,2));
        //System.out.println(new Store(1,5,2).size());
    }
}
