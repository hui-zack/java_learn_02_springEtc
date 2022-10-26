package hui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/* 1-2 编写SpringMVC配置类 */
@Configuration
@ComponentScan({"hui.controller", "hui.config"})
public class SpringMvcConfig {}

