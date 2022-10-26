## 步骤说明
        1. 创建工程
        2. SSM整合
            * Spring
                SpringConfig
            * SpringMVC
                SpringMvcConfig
                ProjectContainerInitConfig
            * Mybatis
                MybatisConfig
                JdbcConfig
                jdbc.properties
        3. 功能模块
            (1) 表与实体类
            (2) hui.dao(接口+自动代理)
            (3) hui.service(接口+实现类)    
                业务层接口测试
            (4) controller
                表现层接口测试(PostMan)


## SSM整合流程
.   [Spring/SpringMVC整合]
.       [SpringConfig](main/java/hui/config/SpringConfig.java)
.       [SpringMvcConfig](main/java/hui/config/SpringMvcConfig.java)
.       [ProjectContainerInitConfig](main/java/hui/config/ProjectContainerInitConfig.java)
.   [Mybatis整合]
.       [JdbcConfig](main/java/hui/config/JdbcConfig.java)
.       [MybatisConfig](main/java/hui/config/MybatisConfig.java)


## 事务处理
.   [2-1 注解开启事务管理器](main/java/hui/config/SpringConfig.java)
.   [2-2 设置事务管理器](main/java/hui/config/JdbcConfig.java)
.   [2-3 业务层接口添加添加事务注解](main/java/hui/service/UserService.java)

## 接口测试
.   [业务层接口测试](test/java/hui/service/UserServiceTest.java)
.   [表现层接口测试-使用postman](./SSM基础整合知识点.md)

