package hui.dao;

import org.springframework.stereotype.Repository;

public interface PasswordDao {
    boolean verify(String url, String password);
}
