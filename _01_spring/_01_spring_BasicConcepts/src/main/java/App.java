import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;
import service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        //不适用spring的
//        BookService bookService = new BookServiceImpl();
//        bookService.save();
        /* 1-1 获取ioc容器对象 */
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        /* 1-2 使用getBean方法获取Bean对象 */
        BookServiceImpl bookService = (BookServiceImpl) ctx.getBean("bookService");
        bookService.save();
    }
}
