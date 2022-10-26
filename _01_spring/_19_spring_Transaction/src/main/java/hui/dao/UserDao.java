package hui.dao;

import hui.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {
    @Select("select * from tb_user")
    List<User> selectAll();

    @Update("update tb_user set money = money + #{money} where username = #{name}")
    int inMoney(@Param("name") String name, @Param("money") Double money);

    @Update("update tb_user set money = money - #{money} where username = #{name}")
    int outMoney(@Param("name") String name, @Param("money") Double money);
}
