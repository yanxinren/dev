package com.ryx.mapper;

import com.ryx.model.Salgrade;

public interface SalgradeMapper {
    int insert(Salgrade record);

    int insertSelective(Salgrade record);
}