package service.impl;

import dao.impl.BookDaoImpl;
import dao.impl.UserDaoImpl;
import service.DatabaseService;

public class DatabaseServiceImpl implements DatabaseService {
    /* 2-1 构造方法注入引用数据类型 */
    private BookDaoImpl bookDao;
    private UserDaoImpl userDao;

    public DatabaseServiceImpl(BookDaoImpl bookDao, UserDaoImpl userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void save() {
        bookDao.save();
    }



}
