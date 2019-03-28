# 首页后台

------

- homepage-api : 接口服务 --app端调用的接口
- homepage-common : 首页后台的公共包
- homepage-manager : 首页后台管理服务

```
项目结构图案列
    parent          --项目根目录
        * disconf     
            --download    --在远程拉取的disconf配置文件的目录
        * homepage-api    --为原生与h5端提供接口
            src
                main
                    java   
                        ... 
                            --common         公共资源包
                            --configuration   项目配置类     
                            --constants       常量
                            --controller      控制层
                                --input       请求参数
                                --ouput       响应Da
                            --convert         转换类
                            --data            dao层
                                --entity      实体
                                --mapper      mapper接口
                            --enums           枚举
                            --interceptor     拦截器
                            --manager         三方调用
                            --service         业务层
                                --impl        实现
                            --util            工具类
                                .
                                .
                                .
                            ...Application
                    resources 
                        mapper               mapper实现
                        static               前端文件
                        application.yml      项目配置
                        disconf.properties   disconf配置项
                        log4j2.yml           日志配置
        pom.xml            
```

------

> > ## `项目常用框架技术:`
> >
> > > > > ​    百度的[disconf](https://www.cnblogs.com/majinju/p/4502246.html)分布式配置中心
> > > > > ​    Dao层使用[baomidou](https://mp.baomidou.com/)框架
> > > > > ​    接口文档使用[swagger-ui](https://github.com/swagger-api/swagger-ui)接口文档技术
> > > > >
> > > > > 部署使用docker部署，采用打war包方式生成docker镜像
> > > > >
> > > > > ------
