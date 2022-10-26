package hui;

import hui.config.SpringConfig;
import hui.dao.BookDao;
import hui.service.impl.BookServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        /* 1-3 使用AnnotationConfigApplicationContext实例化LoC容器 */
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ctx.registerShutdownHook();

        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
        bookDao.save();

        BookServiceImpl bookDaoService = ctx.getBean("bookDaoService", BookServiceImpl.class);
        bookDaoService.save();
    }
}
