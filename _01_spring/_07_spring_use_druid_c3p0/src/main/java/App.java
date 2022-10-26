import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
    public static void main(String[] args)  {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();

        /* 1-3 调用druid数据源对象 */
        DataSource druidDataSource = (DataSource) ctx.getBean("druidDataSource");
        System.out.println("druidDataSource: " + druidDataSource);

        /* 2-3 调用c3p0数据源对象 */
        DataSource c3p0DatabaseSource = (DataSource) ctx.getBean("c3p0DataSource");
        System.out.println("c3p0DatabaseSource: " + c3p0DatabaseSource);
    }
}
