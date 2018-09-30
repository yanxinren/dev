package com.ryx.others.java8;

/**
 * @author ryx
 * @ProjectName my-dev
 * @Description:
 * @date 2018/9/28 002820:16
 */
public interface PersonFactory<P extends Person> {
    P creat( String name, String sex,int age);
}
