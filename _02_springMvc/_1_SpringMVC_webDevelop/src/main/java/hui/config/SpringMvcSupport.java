package hui.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/* 1-3 编写静态资源配置类SpringMvcSupport */
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    /* 1-3-1 添加不由中央Controller控制器处理的请求路径-用于访问静态资源 */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/*").addResourceLocations("/pages/");
    }
}
