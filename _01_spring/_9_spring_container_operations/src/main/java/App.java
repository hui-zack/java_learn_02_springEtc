import dao.BookDao;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import service.BookService;
import service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        /* 1 使用类路径加载spring配置文件 */
        ClassPathXmlApplicationContext classPathCtx = new ClassPathXmlApplicationContext("applicationContext.xml");

        /* 2 加载多个配置文件 */
        // ClassPathXmlApplicationContext manySpringConfigCtx = new ClassPathXmlApplicationContext("applicationContext.xml, applicationContext2.xml");

        /* 3 使用全路径加载spring配置文件 */
        FileSystemXmlApplicationContext fileSystemCtx = new FileSystemXmlApplicationContext("D:\\user\\learn\\java\\_5_spring\\_9_spring_container_operations\\src\\main\\resources\\applicationContext.xml");

        /* 4 使用BeanFactory加载spring配置文件 */
        ClassPathResource resource = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);

        BookDao bookDao = xmlBeanFactory.getBean("bookDao", BookDao.class);

        /* 5 获取bean方式1 */
        BookDao bookDao1 = (BookDao) classPathCtx.getBean("bookDao");

        /* 6 获取bean方式2 */
        BookDao bookDao2 = classPathCtx.getBean("bookDao", BookDao.class);

        /* 7 获取bean方式3, 根据类型获取(容器中该类型的bean只能有一个, 多个会报错) */
        BookDao bookDao3 = fileSystemCtx.getBean(BookDao.class);
        BookDao bookDao4 = fileSystemCtx.getBean(BookDao.class);

        System.out.println(bookDao1.toString());
        System.out.println(bookDao1.toString());
        System.out.println(bookDao2.toString());
        System.out.println(bookDao3.toString());
        System.out.println(bookDao4.toString());
    }
}
