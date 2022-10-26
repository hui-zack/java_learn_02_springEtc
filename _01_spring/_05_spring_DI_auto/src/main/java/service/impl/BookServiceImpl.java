package service.impl;

import dao.BookDao;
import service.BookService;

/**
 * DI-依赖注入  Bean与Bean之间的依赖关系在applicationContext.xml中注明
 *      1-2 有了setBookDao方法, 自动获取IoC的bookDao对象
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private String city;

    public void save() {
        System.out.println("[bookServiceImpl] - save(): run...");
        bookDao.save();
    }

    /* 1-2提供对应的set方法, 供spring-IoC容器注入使用 */
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

}
