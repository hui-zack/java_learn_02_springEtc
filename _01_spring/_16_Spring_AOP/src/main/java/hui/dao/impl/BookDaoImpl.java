package hui.dao.impl;

import hui.dao.BookDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BookDaoImpl implements BookDao {
    public int testRunTime(){
        int tmp = -1;
        for (int i = 0; i < 10000; i++){
            // System.out.println(tmp);
            tmp = i;
        }
        return tmp;
    }

    public void update(){
        System.out.println("BookDaoImpl.update()...");
    }
    public void delete(){
        System.out.println("BookDaoImpl.delete()...");
    }

    public void select(){
        System.out.println("BookDaoImpl.select()...");
    }
}
