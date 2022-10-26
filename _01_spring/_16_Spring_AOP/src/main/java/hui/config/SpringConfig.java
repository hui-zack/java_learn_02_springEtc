package hui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("hui")
@EnableAspectJAutoProxy     /* 1-1 配置Spring支持AOP注解开发 */
public class SpringConfig {
}
