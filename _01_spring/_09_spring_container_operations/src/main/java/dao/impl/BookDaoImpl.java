package dao.impl;

import dao.BookDao;

public class BookDaoImpl implements BookDao {
    BookDaoImpl(){
        System.out.println("constructor");
    }
    public void save() {
        System.out.println("bookImpl.save() run");
    }
}
