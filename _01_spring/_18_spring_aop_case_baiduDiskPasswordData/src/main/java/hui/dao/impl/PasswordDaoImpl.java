package hui.dao.impl;

import hui.dao.PasswordDao;
import org.springframework.stereotype.Repository;

@Repository
public class PasswordDaoImpl implements PasswordDao {
    @Override
    public boolean verify(String url, String password) {
        return password.equals("root");
    }
}
