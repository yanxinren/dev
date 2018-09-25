package com.ryx.model;


import javafx.application.Application;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ryx
 * @ProjectName demo
 * @Description:  学习ioc
 * @date 2018/8/18 001816:17
 */
public class IocTest {
    private static Logger logger = Logger.getLogger(IocTest.class);

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        UserBO user = ac.getBean(UserBO.class);
        System.out.println(user);
    }
}
