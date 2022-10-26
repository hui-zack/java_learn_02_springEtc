## Spring和SpringMVC之间Bean的区分与控制
    1. 基本概念:
        (1) SpringMVC相需要控制的Bean:        
                表现层Bean
        (2) Spring需要控制的Bean:
                业务Bean: 如Service等
                功能Bean: 如DataSource等
    2. 由于Spring和SpringMVC的功能不同, 如何避免Spring错误加载到SpringMVC的Bean?
            加载Spring控制的Bean的时候, 排除SpringMVC控制的Bean

# 同时使用Spring和SpringMVC
.   [1-1 编写SpringConfig配置类](main/java/hui/config/SpringConfig.java)
.       [1-1-1 @ComponentScan注解逐个扫描由Spring管理Bean的包](main/java/hui/config/SpringConfig.java)
.       [1-1-2 @ComponentScan注解选定hui包, 使用excludeFilters属性过滤不由Spring管理的Bean](main/java/hui/config/SpringConfig.java)
.   [1-2 编写SpringMVC配置类](main/java/hui/config/SpringMvcConfig.java)
.   [1-3 编写ProjectContainerInitConfig配置类](main/java/hui/config/ProjectContainerInitConfig.java)
.       [1-3-1 在服务器中加载Spring容器(IoC)对象](main/java/hui/config/ProjectContainerInitConfig.java)
.       [1-3-2 在服务器中加载SpringMVC容器对象](main/java/hui/config/ProjectContainerInitConfig.java)

