package hui;

import hui.config.SpringConfig;
import hui.dao.BookDao;
//import hui.dao.impl.BookDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDaoImpl = ctx.getBean(BookDao.class);

        /* 1-5 调用被通知的方法 */
        System.out.println(BookDao.class);
        bookDaoImpl.update();
        System.out.println();
        int runTime = bookDaoImpl.testRunTime();
        System.out.println(runTime);
    }
}
