## SpringMVC配置拦截器的简化方法
[SpringMVC简化配置拦截器的方法]
    [1-1 表现层编写拦截器Bean-所属包需要被扫描](main/java/hui/controller/interceptor/ProjectInterceptor.java)
        [1-1-1 自定义Controller方法运行前拦截](main/java/hui/controller/interceptor/ProjectInterceptor.java)
        [1-1-2 自定义Controller方法运行后拦截](main/java/hui/controller/interceptor/ProjectInterceptor.java)
        [1-1-3 自定义Controller方法运行后+postHandle后拦截](main/java/hui/controller/interceptor/ProjectInterceptor.java)

[在SpringMvcConfig配置类中直接设置需要拦截的路径]
    [1-2 在SpringMVConfig类中直接设置拦截器](main/java/hui/config/SpringMvcConfig.java)

## 拦截器链
[实现拦截器链]
    [3-1 编写第二个拦截器-ProjectInterceptor2](main/java/hui/controller/interceptor/ProjectInterceptor2.java)
    [3-2 在SpringMVCConfig中设置第二个拦截器](main/java/hui/config/SpringMvcConfig.java)
    
    1. 多个拦截器的执行顺序:
        当配置多个拦截器时, 形成拦截器链
        在SpringMvcConfig中先添加的拦截器以先进先出的方式顺序执行 
    
## 拦截器参数的作用-以preHandle为例
    1. HttpServletRequest request
        请求对象
    2. HttpServletResponse response
        响应对象
    3. Object handler
        被调用的处理器对象, 本质上是一个方法的对象, 对反射技术中的Method对象(获取成员方法)进行了再包装
    
    4. modelAndView:
        如果处理器执行完成并具有返回结果, 可以读取到对应数据与页面信息, 并进行调整
        现在主要返回json, 一般不用
    5. ex参数
        主要用于处理异常, 项目异常处理器已经完美代替, 一般不用
