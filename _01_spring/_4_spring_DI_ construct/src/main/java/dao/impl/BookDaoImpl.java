package dao.impl;

import dao.BookDao;

public class BookDaoImpl implements BookDao {
    /* 1-1 构造方法注入基本数据类型 */
    String databaseName;
    int connectionNum;

    public BookDaoImpl(String databaseName, int connectionNum) {
        this.databaseName = databaseName;
        this.connectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("databaseName = " + databaseName + ", connectionNum = " + connectionNum);
    }
}
