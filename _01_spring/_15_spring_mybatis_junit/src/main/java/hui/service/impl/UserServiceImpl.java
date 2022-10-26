package hui.service.impl;

import hui.domain.User;
import hui.service.UserService;
import hui.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> selectById(int id) {
        return userDao.selectById(id);
    }

    public int deleteById(int id) {
        return userDao.deleteById(id);
    }
}



