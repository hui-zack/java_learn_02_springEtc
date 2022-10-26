package hui.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public interface BookDao {
    int testRunTime();

    void update(int num, String string);


    String select(int id, String data);

    Boolean delete(int id);
}
