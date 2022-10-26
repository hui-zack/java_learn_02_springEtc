package hui.depend;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
* 加入这是第三方Bean(druidDataSource)需要的依赖
*
* */
@Component("DataSourceDepend")      // 配置为Bean
@Scope("singleton")                 // 单例Bean
public class DataSourceDepend {
    public void save(){
        System.out.println("DataSourceDepend.save()");
    }
}
