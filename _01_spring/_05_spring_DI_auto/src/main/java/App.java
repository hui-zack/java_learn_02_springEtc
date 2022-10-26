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

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();

        /* 1-3 调用bookService的save方法 */
        BookServiceImpl bookService = (BookServiceImpl) ctx.getBean("bookService");
        bookService.save();
    }
}
