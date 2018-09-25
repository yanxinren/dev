package com.ryx.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ryx
 * @ProjectName demo
 * @Description:
 * @date 2018/8/18 001816:13
 */
//@Configuration代表的是这个是一个java的配置文件
@Configuration
public class AppConfig {
    @Bean(value = "user")
    public UserBO initUser() {
        UserBO user = new UserBO();
        user.setId(11L);
        user.setUsername("me");
        user.setNote("11");
        return user;
    }
}
