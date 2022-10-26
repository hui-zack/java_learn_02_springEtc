package hui;

import hui.config.SpringConfig;
import hui.dao.BookDao;
//import hui.dao.impl.BookDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = ctx.getBean(BookDao.class);

        /* 调用被通知的方法 */
        System.out.println("-------1-------");
        bookDao.update(123, "data");

        System.out.println("-------2-------");
        bookDao.select(1, "data");

        System.out.println("-------3-------");
        bookDao.delete(1);

        System.out.println("------_4-------");
        bookDao.testRunTime();

    }
}
