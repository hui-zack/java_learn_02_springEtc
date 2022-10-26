package hui.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("hui")
@PropertySource("classpath:jdbc.properties")
/* 1-2 在springConfig配置类中使用@Import(JdbcConfig.class)引入第三方的类 */
@Import(JdbcConfig.class)
public class SpringConfig {
}
