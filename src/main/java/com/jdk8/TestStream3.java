package com.jdk8;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: thinkInJava
 * @Author myFlowerYourGrass
 * @Date 2019-07-20 20:17
 * @Version 1.0
 * @Description 终止操作
 */
public class TestStream3 {
    List<Employe> employes = Arrays.asList(
            new Employe("张三", 18, 9999.99, Employe.Status.FREE),
            new Employe("李四", 58, 5555.5, Employe.Status.BUSY),
            new Employe("王五", 26, 3333.3, Employe.Status.VOCATION),
            new Employe("赵柳", 36, 6666.66, Employe.Status.FREE),
            new Employe("田七", 12, 8888.88, Employe.Status.BUSY)
    );

    /**
     * 查找与匹配
     * allMatch——检查是否匹配所有元素
     * anyMatch——检查是否至少匹配一个元素
     * noneMatch——检查是否没有匹配所有元素
     * findFirst——返回第一个元素
     * findAny——返回当前流中的任意元素
     * count——返回流中元素的总个数
     * max——返回流中最大值
     * min——返回流中最小值
     * <p>
     * 归约
     * reduce(T identity,BinaryOperator)/reduce(BinaryOperator)——可以将流中元素反复结合起来，得到一个值。
     */
    @Test
    public void test1() {
        boolean b1 = employes.stream()
                .allMatch((e) -> e.getStatus().equals(Employe.Status.BUSY));
        System.out.println(b1);

        System.out.println("==================");
        boolean b2 = employes.stream()
                .anyMatch((e) -> e.getStatus().equals(Employe.Status.BUSY));
        System.out.println(b2);

        boolean b3 = employes.stream()
                .noneMatch((e) -> e.getStatus().equals(Employe.Status.BUSY));
        System.out.println(b3);

        System.out.println("-----------------");
        Optional<Employe> op = employes.stream()
                .sorted((e1, e2) -> Double.compare(e1.getMoney(), e2.getMoney()))
                .findFirst();
        System.out.println(op);

        Optional<Employe> op2 = employes.stream()
                .filter((e) -> e.getStatus().equals(Employe.Status.FREE))
                .findAny();
        System.out.println(op2);
    }

    @Test
    public void test2() {
        Long count = employes.stream()
                .count();
        System.out.println(count);

        Optional<Employe> op1 = employes.stream()
                .max((e1, e2) -> Double.compare(e1.getMoney(), e2.getMoney()));
        System.out.println(op1);

        Optional<Double> op2 = employes.stream()
                .map(Employe::getMoney)
                .min(Double::compare);
        System.out.println(op2.get());
    }

    /**
     * 归约
     * reduce(T identity,BinaryOperator)/reduce(BinaryOperator)——可以将流中元素反复结合起来，得到一个值。
     */
    @Test
    public void test3() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //System.out.println(list.get(list.size()-1));

        Integer sum = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(sum);

        System.out.println("=========");

        Optional<Double> op = employes.stream()
                .map(Employe::getMoney)
                .reduce(Double::sum);
        System.out.println(op.get());
    }

    /**
     * 收集
     * collect——将流转换为其他形式。接收一个Collector接口的实现，用于给Stream中元素做汇总的方法
     */
    @Test
    public void test4() {
        List<String> list = employes.stream()
                .map(Employe::getName)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("===============");

        Set<Employe.Status> set = employes.stream()
                .map(Employe::getStatus)
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println("-------------------");

        HashSet<String> hs = employes.stream()
                .map(Employe::getName)
                .collect(Collectors.toCollection(HashSet::new));
        hs.forEach(System.out::println);

    }

    @Test
    public void test5() {
        //总数
        Long counting = employes.stream()
                .collect(Collectors.counting());
        System.out.println(counting);
        System.out.println("-------------");

        //平均值
        Double avg = employes.stream()
                .collect(Collectors.averagingDouble(Employe::getMoney));
        System.out.println(avg);
        System.out.println("-------------------");

        //总和
        Double sum = employes.stream()
                .collect(Collectors.summingDouble(Employe::getMoney));
        System.out.println(sum);
        System.out.println("============");

        ///最大值
        Optional<Double> max = employes.stream()
                .map(Employe::getMoney)
                .collect(Collectors.maxBy(Double::compareTo));
        System.out.println(max.get());
        System.out.println("==============");
        //最小值
        Optional<Double> min = employes.stream()
                .map(Employe::getMoney)
                .collect(Collectors.minBy(Double::compareTo));
        System.out.println(min);
        System.out.println("----------------");

        //分组
        Map<Employe.Status, List<Employe>> map = employes.stream()
                .collect(Collectors.groupingBy(Employe::getStatus));
        System.out.println(map);
    }

    /**
     * 多级分组
     */
    @Test
    public void test6() {
        Map<Employe.Status, Map<String, List<Employe>>> map = employes.stream()
                .collect(Collectors.groupingBy(Employe::getStatus, Collectors.groupingBy((e) -> {
                    if (e.getAge() <= 35) {
                        return "青年";
                    } else if (e.getAge() <= 50) {
                        return "老年";
                    } else {
                        return "老年";
                    }
                })));
        System.out.println(map);
    }

    /**
     * 分区
     */

    public void test7() {
        Map<Boolean, List<Employe>> map = employes.stream()
                .collect(Collectors.partitioningBy((e) -> e.getMoney() > 8000));
        System.out.println(map);
    }

    @Test
    public void test8(){
        DoubleSummaryStatistics dss = employes.stream()
                .collect(Collectors.summarizingDouble(Employe::getMoney));
        System.out.println(dss.getMax());
        System.out.println(dss.getCount());
        System.out.println(dss.getAverage());
    }
    @Test
    public void test9(){
        String s = employes.stream()
                .map(Employe::getName)
                .collect(Collectors.joining(",","==","--"));
        System.out.println(s);
    }
    @Test
    public void test10(){
        String s = "";
        System.out.println(Double.valueOf(s));
    }
    @Test
    public void test11(){
        String s = "[神州租车·宝沃1天免费体验券]\n" +
                "[使用条件]\n" +
                "关联日起3天完成取还车的日租订单可享；\n" +
                "[使用规则]\n" +
                "①租期>=1天时日租订单可用，可免租期内首日的【车辆租赁及服务费】、【基础服务费】和【车辆整备费】，其他费用正常收取；\n" +
                "②每单限用1张，每名用户仅可享受1次宝沃免费试驾优惠；\n" +
                "③不与顺风车、预付特价、套餐产品同享，不与其他优惠活动、优惠类租车券同时享用，分时租赁产品不可用，上门送车订单不可用；\n" +
                "④优惠券不可转赠、不开发票、不找零、不兑换现金；\n" +
                "[使用城市]仅限贵阳、昆明、济宁各直营门店；\n" +
                "[使用车型]仅限宝沃BX5、BX6、BX7相关车型；";


        String[] ss = s.replaceFirst("\\[","")
        .replaceAll("\\]\\n\\n","&&")
        .replaceAll("\\]\\n","&&")
        .replaceAll("\\]","&&")
        .split("\\[");
        List<A> a = Arrays.stream(ss).map(A::new).collect(Collectors.toList());



        System.out.println(a);
        //List<String> ss2 = ss.stream().filter(e->StringUtils.isNotBlank(e)).collect(Collectors.toList());
        //System.out.println(ss2);
        //List<CouponUseContent> couponUseContents = ss2.stream().map(s1 -> {
        //    CouponUseContent couponUseContent = new CouponUseContent();
        //    couponUseContent.setUseTitle(s1);
        //    couponUseContent.setUseTitle(s1);
        //    return couponUseContent;
        //}).collect(Collectors.toList());
        //System.out.println(couponUseContents);
    }

    private class A{
        private String title;
        private String name;

        public String getName() {
            return name;
        }

        public A(String o) {
            String[] ss = o.split("&&");
            this.title = ss[0];
            if(ss.length>1) {
				this.name = ss[1].replaceAll("[\n\r]+$", "");
			}
            //this.name = ss[1].endsWith("\\n")?ss[1].substring(0,ss[1].length()-3):ss[1];
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

		@Override
		public String toString() {
			return "A{" +
					"title='" + title + '\'' +
					", name='" + name + '\'' +
					'}';
		}

	}
}
