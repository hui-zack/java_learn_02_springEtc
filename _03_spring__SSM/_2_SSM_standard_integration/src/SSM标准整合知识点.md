# SSM标准整合知识点
------------------------------------------------------------------------------------------------------------------------
## 统一数据响应格式
[设置统一数据响应格式]
    [1-1 编写Result类设置标准响应格式](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/controller/dataResponse/Result.java)
    [1-2 编写Code设置响应码](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/controller/code/Code.java)
    [1-3 在Controller中编写标准响应代码](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/controller/UserController.java)

## 统一异常处理器
[自定义常用异常类]
    [2-1 自定义BusinessException业务异常类](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/exception/BusinessException.java)
    [2-2 自定义SystemException系统异常类](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/exception/SystemException.java)

[业务层Code类中添加异常响应码]
    [2-3 编写Code设置异常响应码](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/controller/code/Code.java)
    
[设置统一异常处理器]
    [2-4 设置异常处理类 (@RestControllerAdvice注解-所属包需被SpringMvcConfig扫描到)](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/exception/ProjectException.java)
        [2-4-1 处理业务异常 使用@ExceptionHandler()注解](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/exception/ProjectException.java)
        [2-4-2 处理系统异常 使用@ExceptionHandler()注解](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/exception/ProjectException.java)
        [2-3-3 处理未知异常 使用@ExceptionHandler()注解](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/exception/ProjectException.java)
        
[使用自定义异常]
    [2-5 使用自定义异常 try..catch处理-抛出自定义异常](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/service/impl/UserServiceImpl.java)
        
    1. 异常位置与常见诱因
        框架内部异常              -->         如: 框架使用不规范
        数据层抛出的异常           -->         如: 外部服务器故障所致      
        业务层抛出的异常           -->         如: 业务逻辑书写错误
        表现层抛出的异常           -->         如: 数据手机, 校验等规则导致
        工具栏抛出的异常           -->         如: 工具类书写不严谨或不健壮
    2. @RestControllerAdvice注解
        作用: 设置异常处理器, 从MVC控制器中获取异常, 使用AOP技术进行处理
        说明: 放在类名上方, 此注解知道@ResponseBody注解和@Component注解
    3. @ExceptionHandler(Exception.class)
        作用: 根据指定的异常类型进行处理, 出现异常后终止原控制器执行, 转入当前处理方法
        说明: 此类方法可以根据处理的异常不用, 制作多个方法分别处理对应的异常

    4. 项目异常分类
        * 业务异常(BusinessException)       
            异常原因:
                不规范的用户行为操作带来的异常
            处理方案:
                发送对应消息传递给客户, 提醒规范操纵
        * 系统异常(SystemException)
            异常原因:
                项目运行过程中可预见但无法避免的异常, 如mysql连接失败
            处理方案:
                发送固定消息给用户, 安抚用户
                发送特定消息给运维人员, 提醒维护
                记录日志
            
        * 其他异常(Exception)
            异常原因:
                编程人员未预料的异常
            处理方案:
                发送固定消息给用户, 安抚用户
                发送特定消息给编程人员, 提醒维护(纳入预期范围欸)
                记录日志
              
        



# 基础整合
------------------------------------------------------------------------------------------------------------------------
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
            (2) com.hui.dao(接口+自动代理)
            (3) com.hui.service(接口+实现类)    
                业务层接口测试
            (4) controller
                表现层接口测试(PostMan)


## SSM整合流程
.   [Spring/SpringMVC整合]
.       [SpringConfig](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/config/SpringConfig.java)
.       [SpringMvcConfig](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/config/SpringMvcConfig.java)
.       [ProjectContainerInitConfig](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/config/ProjectContainerInitConfig.java)
.   [Mybatis整合]
.       [JdbcConfig](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/config/JdbcConfig.java)
.       [MybatisConfig](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/config/MybatisConfig.java)


## 事务处理
.   [old_1-1 注解开启事务管理器](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/config/SpringConfig.java)
.   [old_1-2 设置事务管理器](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/config/JdbcConfig.java)
.   [old_1-3 业务层接口添加添加事务注解](../../../_9_SpringBoot/_3_springboot_ssm/src/main/java/com/com.hui/service/UserService.java)

## 接口测试
.   [业务层接口测试](test/java/com.hui/service/UserServiceTest.java)
.   [表现层接口测试-使用postman](./SSM标准整合知识点.md)

========================================================================================================================