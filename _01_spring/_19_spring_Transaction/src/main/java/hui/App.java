package hui;

import hui.Service.UserService;
import hui.config.SpringConfig;
import hui.domain.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.transfer("lisi", "zhangsan", 50.0);

        List<User> users = userService.selectAll();
        for (User user: users){
            System.out.println(user);
        }

    }
}
