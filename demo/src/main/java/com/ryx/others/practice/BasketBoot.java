package com.ryx.others.practice;

import java.sql.SQLOutput;

/**
 * @author ryx
 * @ProjectName demo
 * @Description: 父子类  super class BasketBoot
 * @date 2018/9/7 000714:28
 */
public class BasketBoot extends Sport {
    public static void main(String[] args) {
        new BasketBoot().test();
    }

    public void test() {
        //super.getClass()方法
        //   public final native Class<?> getClass(); get
        Class<? extends Sport> aClass = super.getClass();
        System.out.println(super.getClass().getName());
    }
}
