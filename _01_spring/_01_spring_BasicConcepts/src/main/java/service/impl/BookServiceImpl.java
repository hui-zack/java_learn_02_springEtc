package service.impl;

import dao.BookDao;
import service.BookService;

/**
 * DI-依赖注入  Bean与Bean之间的依赖关系在applicationContext.xml中注明
 *      1-2 有了setBookDao方法, 自动获取IoC的bookDao对象
 */
public class BookServiceImpl implements BookService {
    /* 1-1产出new出来的对象, 但保留声明 */
    private BookDao bookDao;

    public void save() {
        System.out.println("[bookServiceImpl] - save(): run...");
        bookDao.save();
    }

    /* 1-2提供对应的set方法, 供spring-IoC容器使用 */
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

}
