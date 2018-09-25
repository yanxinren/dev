package com.ryx.others.http;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController2 {
    private HttpServletRequest request;

    @ModelAttribute
    public void bindRequest(HttpServletRequest request) {
        this.request = request;
    }

    @RequestMapping("/test")
    public void test() throws InterruptedException {
        // 模拟程序执行了一段时间
        Thread.sleep(1000);
    }

}