package hui.dao.impl;

import hui.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("bookDao")                   /* 1-2-1 使用注解将实现类BookDaoImpl配置为Bean */
@Scope("singleton")                     /* 2-1 @Scope注解bean的实例数量 */       // LoC容器中只实例一个bean对象, 多实例用@Scope("prototype")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("bookDaoImpl.save - run ");
    }

    @PostConstruct                      /* 2-2 @PostConstruct注解为初始化行数 */
    public void init(){
        System.out.println("bookDaoImpl.init()");
    }

    @PreDestroy                         /* 2-3 @PreDestroy注解为destroy行数 */
    public void destroy(){
        System.out.println("bookDaoImpl.destroy()");
    }
}
