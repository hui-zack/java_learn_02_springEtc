package hui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@ComponentScan({"hui.controller", "hui.config"})
@EnableWebMvc                       /* 5-2 @EnableWebMvc注解打开json快速转换功能 */
public class SpringMvcConfig {
    /* 添加不由mvc处理的请求路径-用于访问静态资源 */

    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/*").addResourceLocations("/pages");
    }
}
