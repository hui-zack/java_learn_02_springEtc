package service.impl;

import dao.impl.BookDaoImpl;
import dao.impl.UserDaoImpl;
import service.DatabaseService;

public class DatabaseServiceImpl implements DatabaseService {
    /* 2-1 setter注入引用数据类型 */
    private BookDaoImpl bookDao;
    private UserDaoImpl userDao;
    @Override
    public void save() {
        System.out.println("DatabaseService.save() run ");
        bookDao.save();
    }

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
