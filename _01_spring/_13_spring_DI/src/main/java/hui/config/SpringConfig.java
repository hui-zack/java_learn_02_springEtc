package hui.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration                              // 命名空间注解-相当于applicationContext.xml中的命名空间
@ComponentScan({"hui"})                     // 包扫描器
@PropertySource("jdbc.properties")          /* 3-1 spring配置类加载properties注解@PropertySource("jdbc.properties") */
public class SpringConfig {

}
