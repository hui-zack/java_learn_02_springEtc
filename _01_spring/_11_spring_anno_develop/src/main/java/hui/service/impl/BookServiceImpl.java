package hui.service.impl;

import hui.service.BookService;
import org.springframework.stereotype.Component;

/* 1-2-2 使用注解将实现类BookServiceImpl配置为Bean */
@Component("bookDaoService")
public class BookServiceImpl implements BookService {

    public void save() {
        System.out.println("bookServiceImpl.save run");
    }

}
