package com.ryx.others.practice;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ryx
 * @ProjectName demo
 * @Description:
 * @date 2018/8/24 002416:29
 */
public class Practice {
    private static Integer age;
    private static final String SS = "BE";

    public static void main(String[] args) {
        String ss = "BE1005";
        boolean flag = StringUtils.contains(ss, SS);
        System.out.println(flag ? "success" : "failure");

        System.out.println(age == 1 ? "yes 自动拆箱" : "no");


    }


}
