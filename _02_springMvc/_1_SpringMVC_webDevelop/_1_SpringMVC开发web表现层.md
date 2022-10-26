    
## SpringMVC快速流程
.   [1-1 导入SpringMVC依赖坐标](pom.xml)
.   [1-2 编写SpringMVC配置类](src/main/java/hui/config/SpringMvcConfig.java)
    [1-3 编写静态资源配置类SpringMvcSupport](src/main/java/hui/config/SpringMvcSupport.java)
        [1-3-1 添加不由mvc处理的请求路径-用于访问静态资源](src/main/java/hui/config/SpringMvcSupport.java)
        [1-3-2 在SpringMvcConfig中添加扫描SpringMvcSupport的包](src/main/java/hui/config/SpringMvcConfig.java)
.   [1-4 编写ProjectContainerInitConfig类](src/main/java/hui/config/ProjectContainerInitConfig.java)
.       [1-4-1 在ProjectContainerInitConfig配置类中返回SpringMVC容器对象](src/main/java/hui/config/ProjectContainerInitConfig.java)
.   [1-5 编写表现层代码](src/main/java/hui/controller/UserController.java)
.       [1-5-1 @RequestMapping("/test")注解设置请求路径](src/main/java/hui/controller/UserController.java)
.       [1-5-2 @ResponseBody注解配置返回值为响应体](src/main/java/hui/controller/UserController.java)
    
    注意: Spring的配置类和SpringMVC的配置类不可混淆, 其容器并不相同!

## SpringMVC技术的理解
    SpringMVC:
        是一种基于java实现MVC模型的轻量级web框架       //轻量级: 内存占用比较低, 运行性能比较高
    使用场景:
        SpringMVC与Servlet技术功能等同, 均属于web层开发技术
    优点:
        使用简单, 开发便捷(相比与Servlet)
        
## SpringMVC学习路线
    1. SpringMVC简介
    2. 请求与响应
    3. REST风格开发
    4. SSM整合
    5. 拦截器
    
## 学习目标
    1. 掌握基于SpringMVC获取请求参数与响应json数据
    2. 熟练应用基于REST风格的请求路径设置与参数传递
    3. 能够根据实际业务建立前后端开发通信协议并进行实现
    4. 基于SSM整合技术开发任意业务模块功能功能

    
    
## SpringMVC项目的工作流程
    1. 启动服务器项目初始化过程
        1. 服务器启动, 执行SpringMvcConfig类, 初始化web容器(MVC容器)    
        2. 执行SpringMvcConfig的createServletApplicationContext()方法, 创建webApplicationContext对象
        3. 加载SpringConfig配置类
        4. 执行@ComponentScan加载对应的Bean
        5. 加载UserController, 每个@RequestMapping注解对应一个具体的方法
        6. 执行getServletMappings方法, 定义所有的请求都通过SpringMVC
    
    2. 单次请求过程
        1. 发送请求Localhost:8085/save
        2. web容器由于设置为所有请求经过SpringMVC, 将请求交给SpringMVC处理
        3. 解析请求路径/save
        4. 由/save匹配到UserController.save()方法
        5. 执行save()方法
        6. 检测到#ResponseBody直接将save()方法的返回值作为响应体返回请求方
