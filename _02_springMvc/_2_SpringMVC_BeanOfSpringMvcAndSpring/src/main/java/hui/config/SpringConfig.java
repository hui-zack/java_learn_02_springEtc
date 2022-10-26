package hui.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/* 1-1 编写SpringConfig配置类 */

@Configuration
//@ComponentScan({"hui.dao", "hui.dao", "hui.domain", "hui.service"})       /* 1-1-1 @ComponentScan注解逐个输入由Spring管理Bean的包 */
@ComponentScan(                                         /* 1-1-2 @ComponentScan注解选定hui包, 使用excludeFilters属性过滤不由Spring管理的Bean */
    value = "hui",
    excludeFilters = @ComponentScan.Filter(             //* 编写Bean过滤器
        type = FilterType.ANNOTATION,                   //* 根据注解排除Bean
        classes = Controller.class                      //* 排除所有由@Controller注解修饰的Bean
    )
)
public class SpringConfig {
}
