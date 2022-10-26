package hui.dao;
import hui.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserDao {
    @Select("select * from users where id = #{id}")
    List<User> selectById(int id);

    @Delete("delete from users where id = #{id}")
    int deleteById(int id);
}
