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
        if (true) throw new NullPointerException();
        return tmp;
    }

    public void update(int num, String str){
        System.out.println("BookDaoImpl.update()...num=" + num + ", str=" + str);
    }
    public Boolean delete(int id){
        System.out.println("BookDaoImpl.delete()...");
        return true;
    }

    public String select(int id, String data){
        System.out.println("BookDaoImpl.select()...");
        return id + " " + data;
    }
}
