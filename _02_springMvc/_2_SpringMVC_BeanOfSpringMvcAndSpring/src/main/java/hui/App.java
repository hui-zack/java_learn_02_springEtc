package hui;

import hui.config.SpringConfig;
import hui.controller.UserController;
import hui.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        /* 加载不放入Spring容器的bean报错 */
//        UserController userController = ctx.getBean(UserController.class);
//        System.out.println(userController);

        UserService userService = ctx.getBean(UserService.class);
        Boolean verify = userService.verify("root", "root");
        System.out.println(verify);
    }
}
