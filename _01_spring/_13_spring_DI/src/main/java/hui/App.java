package hui;

import hui.config.SpringConfig;
import hui.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import hui.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ctx.registerShutdownHook();

        BookServiceImpl bookDaoService = ctx.getBean("bookDaoService", BookServiceImpl.class);
        bookDaoService.save();
    }
}
