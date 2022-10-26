package hui.service.impl;

import hui.dao.UserDao;
import hui.domain.User;
import hui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean add(User user) {
        userDao.add(user);
        return true;
    }

    @Override
    public boolean update(User user) {
        userDao.update(user);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        userDao.delete(id);
        return true;
    }

    @Override
    public User selectById(Integer id) {
         return userDao.selectById(id);
    }

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }
}
