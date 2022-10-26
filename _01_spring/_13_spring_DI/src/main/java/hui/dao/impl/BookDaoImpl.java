package hui.dao.impl;

import hui.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("bookDao")
@Scope("singleton")                            // LoC容器中只实例一个bean对象, 多实例用@Scope("prototype")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("bookDaoImpl.save - run ");
    }

    @PostConstruct
    public void init(){
        System.out.println("bookDaoImpl.init()");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("bookDaoImpl.destroy()");
    }
}
