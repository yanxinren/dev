package com.ryx.others.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

@Controller
public class TestController {

    // 存储已有参数，用于判断参数是否重复，从而判断线程是否安全
    public static Set<String> set = new ConcurrentSkipListSet<>();

    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/test")
    public void test() throws InterruptedException {

        // …………………………通过某种方式获得了request对象………………………………

        // 判断线程安全
        String value = request.getParameter("key");
        if (set.contains(value)) {
            System.out.println(value + "重复出现，request并发不安全！");
        } else {
            System.out.println(value);
            set.add(value);
        }

        // 模拟程序执行了一段时间
        Thread.sleep(1000);
    }

}
