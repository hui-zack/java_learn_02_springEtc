package service.impl;

import dao.BookDao;
import org.springframework.stereotype.Component;
import service.BookService;

/* 1-3-2 使用注解将实现类BookServiceImpl配置为Bean */
@Component("bookDaoService")
public class BookServiceImpl implements BookService {
    public void save() {
        System.out.println("bookServiceImpl.save run");
    }
}
