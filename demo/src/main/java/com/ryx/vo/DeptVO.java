package com.ryx.vo;

import com.ryx.group.SelectAllFunction;
import com.ryx.group.SelectFunction;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
@Data
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


}