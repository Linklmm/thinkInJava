package com.test;

/**
 * 版权声明：Copyright(c) 2019
 *
 * @program: ThreadTest
 * @Author minmin.liu(minmin.liu @ ucarinc.com)
 * @Date 2019-04-28 16:53
 * @Version 1.0
 * @Description 测试实体类
 */
public class Human {
    private Integer age;
    private boolean sex;
    private Integer hight;

    public Human(Integer age, boolean sex, Integer hight) {
        this.age = age;
        this.sex = sex;
        this.hight = hight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Integer getHight() {
        return hight;
    }

    public void setHight(Integer hight) {
        this.hight = hight;
    }
}
