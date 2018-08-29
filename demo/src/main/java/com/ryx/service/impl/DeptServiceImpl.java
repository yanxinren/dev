package com.ryx.service.impl;

import com.ryx.mapper.DeptMapper;
import com.ryx.model.Dept;
import com.ryx.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ryx
 * @ProjectName demo
 * @Description:
 * @date 2018/8/22 002219:50
 */
@Service(value = "deptServiceImpl")
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> selectAll() {
        //查询所有的dept
        return deptMapper.selectAll();
    }

}
