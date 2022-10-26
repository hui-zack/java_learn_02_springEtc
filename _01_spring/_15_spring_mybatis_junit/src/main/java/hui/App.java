package hui;

import hui.config.SpringConfig;
import hui.domain.User;
import hui.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        List<User> users = userService.selectById(1);
        System.out.println(users);
    }
}
