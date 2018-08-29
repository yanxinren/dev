package com.ryx.mapper;

import com.ryx.model.emp;

public interface empMapper {
    int deleteByPrimaryKey(Integer empno);

    int insert(emp record);

    int insertSelective(emp record);

    emp selectByPrimaryKey(Integer empno);

    int updateByPrimaryKeySelective(emp record);

    int updateByPrimaryKey(emp record);
}