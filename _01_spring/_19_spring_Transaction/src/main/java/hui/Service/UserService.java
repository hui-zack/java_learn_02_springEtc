package hui.Service;

import hui.dao.UserDao;
import hui.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> selectAll(){
        return userDao.selectAll();
    }

    /* 1-3 在UserService中开启事务 | 2 设置事务(默认为Propagation.REQUIRES_NEW) */
        // timeout = -1 永不超时,
        // propagation = Propagation.REQUIRES_NEW, 设置事务传播行为(合为一个新事务);
        // rollbackFor = Exception.class, 设置非运行时异常也回滚
    @Transactional(timeout = -1, propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void transfer(String outName, String inName, Double money) throws IOException {
        userDao.outMoney(outName, money);
//        int i = 1/0;
//        if (true) {throw new IOException();}
        userDao.inMoney(inName, money);
    }

}
