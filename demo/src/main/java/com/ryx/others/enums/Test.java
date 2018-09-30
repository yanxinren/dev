package com.ryx.others.enums;

public class Test {
    public static void main(String args[]) {
        System.out.println("第一种通过反射");
        Class clz = Rating.class;
        for (Object obj : clz.getEnumConstants()) {
            System.out.println(obj);
        }
        System.out.println("第二种通过枚举静态方法values()");
        for (Rating rate : Rating.values()) {
            System.out.println(rate);
        }
    }
}