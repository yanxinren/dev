package com.ryx.controller;

import com.ryx.group.SelectAllFunction;
import com.ryx.group.SelectFunction;
import org.hibernate.validator.constraints.NotEmpty;

public class DeptVO {
    /**
     * 编号
     */
    private Integer deptno;
    /**
     * 命名
     */
    @NotEmpty(groups = {
            SelectAllFunction.class,
            SelectFunction.class
    })
    private String dname;

    /**
     * 地点
     */
    @NotEmpty(groups = {
            SelectAllFunction.class,
            SelectFunction.class
    })
    private String loc;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc == null ? null : loc.trim();
    }
}