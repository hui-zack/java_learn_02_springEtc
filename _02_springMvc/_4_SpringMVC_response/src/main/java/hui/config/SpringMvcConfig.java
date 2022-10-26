package hui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@ComponentScan({"hui.controller", "hui.config"})
@EnableWebMvc                       /* @EnableWebMvc注解打开json快速转换功能 */
public class SpringMvcConfig {}
