package hui.config;

import hui.controller.interceptor.ProjectInterceptor;
import hui.controller.interceptor.ProjectInterceptor2;
import org.omg.PortableInterceptor.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/* 1-2 在SpringMVConfig类中直接设置拦截器 */
@Configuration
@ComponentScan({"hui.controller"})
public class SpringMvcConfig extends WebMvcConfigurationSupport {
    @Autowired
    private ProjectInterceptor projectInterceptor;
    @Autowired
    private ProjectInterceptor2 projectInterceptor2;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/test", "/test/*");
        /* 3-2 在SpringMVCConfig中设置第二个拦截器 */
        registry.addInterceptor(projectInterceptor2).addPathPatterns("/test", "/test/*");
    }
}
