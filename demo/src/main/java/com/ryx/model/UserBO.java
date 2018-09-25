package com.ryx.model;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * @author ryx
 * @ProjectName demo
 * @Description:
 * @date 2018/8/18 001816:10
 */
@Data
public class UserBO {
    @NotNull(message = "id不能为空")
    private Long id;
    @NotNull(message = "姓名不能为空")
    private String username;
    private String note;
    @NotNull(message = "密码不能为")
    private String password;
}
