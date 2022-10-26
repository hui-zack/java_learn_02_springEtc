import dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();

        /* 1-3 打印bean初始值注入的结果 */
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao.toString());
    }
}
