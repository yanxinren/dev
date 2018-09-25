package com.ryx.controller;

import com.ryx.model.UserBO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @author ryx
 * @ProjectName demo
 * @Description: user controller控制层
 * @date 2018/9/4 000419:53
 * 快捷键  优化导包  ctrl + alt + o
 */
@Controller
public class UserController {
    private final String SUCCESS = "success";

    @PostMapping("/getUser")
    public @ResponseBody
    String getUser(@Valid UserBO user) {
        user.setId(11L);
        user.setPassword("mima");
        user.setUsername("");
        return SUCCESS;
    }
}
