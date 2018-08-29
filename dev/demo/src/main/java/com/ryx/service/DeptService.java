package com.ryx.service;

import com.ryx.model.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ryx
 * @ProjectName demo
 * @Description:
 * @date 2018/8/22 002219:49
 */
@Service
public interface DeptService  {
    /**
     *
     * 方法功能描述:
     *
     * @param:
     * @return:
     * @auther: 查询出所有的detp
     * @date: 2018/8/22 0022 19:51
     */
    List<Dept> selectAll();
}
