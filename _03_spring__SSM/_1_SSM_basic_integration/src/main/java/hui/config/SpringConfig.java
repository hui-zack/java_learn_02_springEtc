package hui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@ComponentScan({"hui.service"})
@PropertySource({"classpath:jdbc.properties"})
@Import({MybatisConfig.class,JdbcConfig.class})
@EnableTransactionManagement            /* 2-1 注解开启事务管理器 */
public class SpringConfig {
}
