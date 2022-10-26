package hui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
    1-1 编写spring配置类__命名空间注解+包扫描器
*/

@Configuration                              // 命名空间注解-相当于applicationContext.xml中的命名空间
@ComponentScan({"hui"})          // 包扫描器
public class SpringConfig {
}
