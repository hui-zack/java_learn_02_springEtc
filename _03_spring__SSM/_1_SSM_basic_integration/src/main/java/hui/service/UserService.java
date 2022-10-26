package hui.service;

import hui.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional                      /* 2-3 业务层接口添加添加事务注解 */
public interface UserService {
    public boolean add(User user);

    public boolean update(User user);

    public boolean delete(Integer id);

    public User selectById(Integer id);

    public List<User> selectAll();
}
