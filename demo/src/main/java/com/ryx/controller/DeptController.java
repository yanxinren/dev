package com.ryx.controller;

import com.ryx.model.Dept;
import com.ryx.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ryx
 * @ProjectName demo
 * @Description: dept controller
 * @date 2018/8/18 001814:42
 */
@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 方法功能描述: 查询所有，慢慢进步
     *
     * @param:
     * @return:
     * @auther:
     * @date: 2018/8/22 0022 20:14
     */
    @GetMapping("select/all")
    public @ResponseBody
    List<Dept> finALL() {
        return deptService.selectAll();
    }

    @GetMapping("/get")
    public @ResponseBody
    String getString() {
        return "Hello World";
    }

    @RequestMapping(value = "get1", method = RequestMethod.GET)
    public @ResponseBody
    String getString1() {
        return "Hello World";
    }


}
