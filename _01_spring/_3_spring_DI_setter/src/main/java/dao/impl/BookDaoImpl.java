package dao.impl;

import dao.BookDao;

public class BookDaoImpl implements BookDao {
    /* 1-1 setter注入基本数据类型 */
    String databaseName;
    int connectionNum;

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }


    @Override
    public void save() {
        System.out.println("[BookDao.save] run");
    }
}
