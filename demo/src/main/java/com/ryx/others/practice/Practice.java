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
        age = 1;
        System.out.println(age == 1 ? "yes 自动拆箱" : "no");

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integers.add(i);
        }
        System.out.println(integers.get(0) + "\t\t\t" + integers.size());
        List list = listPage(integers, 4, 4);
        System.out.println(list);
    }

    public static List listPage(List before, Integer page, Integer limit) {
        List affterList = new ArrayList<>();
        if (null != before && before.size() > 0) {
            int size = before.size();
            //设置总页数
            if (size <= limit) {
                affterList = before;
            } else {
                int numberOfPages = size % limit == 0 ? size / limit : size / limit + 1;
                if (page > 0) {
                    if (page < numberOfPages) {
                        affterList = before.subList((page - 1) * limit, page * limit);
                    } else if (page == numberOfPages) {
                        //最后一页的话
                        affterList = before.subList((numberOfPages - 1) * limit, size);
                    } else {
                        throw new RuntimeException("数组下标越界,分页页数与当页条数不对.");
                    }
                } else {
                    throw new RuntimeException("数组下标越界,分页页数与当页条数不对.");
                }

            }
            return affterList;
        }
        return null;
    }


}
