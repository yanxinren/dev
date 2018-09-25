package com.ryx.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.CompletableFuture;

/**
 * @author ryx
 * @ProjectName demo
 * @Description:
 * @date 2018/9/12 001219:58
 */
public class CompletableFutureController {
    @RequestMapping
    public  CompletableFuture<T> findAll() {
        return new CompletableFuture<T>();
    }
}
