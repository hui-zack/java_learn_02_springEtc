import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DatabaseService;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ctx.registerShutdownHook();
        /* 1-3 2-3 测试运行 */
        DatabaseService databaseService = (DatabaseService) ctx.getBean("databaseService");
        databaseService.save();
    }
}
