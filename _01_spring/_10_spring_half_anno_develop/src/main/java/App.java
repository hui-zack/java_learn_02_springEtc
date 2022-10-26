import dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();

        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
        bookDao.save();

        BookServiceImpl bookDaoService = ctx.getBean("bookDaoService", BookServiceImpl.class);
        bookDaoService.save();
    }
}
