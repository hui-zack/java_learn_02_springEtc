package dao.impl;

import dao.BookDao;
import org.springframework.stereotype.Component;

/* 1-3-1 使用注解将实现类BookDaoImpl配置为Bean */
@Component("bookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("bookImpl.save - run ");
    }
}
