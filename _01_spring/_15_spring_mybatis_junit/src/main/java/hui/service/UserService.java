package hui.service;

import hui.domain.User;
import java.util.List;

public interface UserService {

    List<User> selectById(int id);

    int deleteById(int id);
}
