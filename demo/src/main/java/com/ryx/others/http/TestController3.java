package com.ryx.others.http;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

@Controller
public class TestController3 extends BaseController {

    // 存储已有参数，用于判断参数value是否重复，从而判断线程是否安全
    public static Set<String> set = new ConcurrentSkipListSet<>();

    @RequestMapping("/test")
    public void test() throws InterruptedException {
        String value = request.getParameter("key");
        // 判断线程安全
        if (set.contains(value)) {
            System.out.println(value + "	重复出现，request并发不安全！");
        } else {
            System.out.println(value);
            set.add(value);
        }
        // 模拟程序执行了一段时间
        Thread.sleep(1000);
    }

    @RequestMapping("/test2")
    public void test2() throws InterruptedException {
        String value = request.getParameter("key");
        // 判断线程安全（与TestController使用一个set进行判断）
        if (TestController.set.contains(value)) {
            System.out.println(value + "	重复出现，request并发不安全！");
        } else {
            System.out.println(value);
            TestController.set.add(value);
        }
        // 模拟程序执行了一段时间
        Thread.sleep(1000);
    }
}