## 过滤器和拦截器
    1. 过滤器和拦截器执行的顺序
        过滤器     -->     servlet的Filter
        拦截器     -->     SpringMVC的Intercepter
        
        执行的先后顺序:
            tomcat接受请求 > filter过滤 > Spring中央Controller > Intercepter拦截器 -> 自定义Controller
    2. 拦截器:
        拦截器概念: 拦截器是一种动态拦截方法调用的机制, 在SpringMVC中动态拦截控制器方法的执行
        作用: 
            阻止原本Controller方法的执行:

        
## SpringMVC_拦截器基本流程
[表现层中编写拦截器类]
    [1-1 表现层编写拦截器Bean-所属包需要被扫描](main/java/hui/controller/interceptor/ProjectInterceptor.java)
        [1-1-1 自定义Controller方法运行前拦截](main/java/hui/controller/interceptor/ProjectInterceptor.java)
        [1-1-2 自定义Controller方法运行后拦截](main/java/hui/controller/interceptor/ProjectInterceptor.java)
        [1-1-3 自定义Controller方法运行后+postHandle后拦截](main/java/hui/controller/interceptor/ProjectInterceptor.java)

[在SpringMvcSupport配置类中设置需要拦截的路径]
    [1-2 重写addInterceptors方法设置要拦截的路径](main/java/hui/config/SpringMvcSupport.java)
    
        