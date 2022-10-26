import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.*;

public class App {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();

        /* 1-4 获取druid数据源对象 */
        DataSource druidDataSource = (DataSource) ctx.getBean("druidDataSource");
        System.out.println("druidDataSource: " + druidDataSource);

        Connection connection = druidDataSource.getConnection();

        PreparedStatement ps = connection.prepareStatement("select * from device");
        ResultSet rs = ps.executeQuery();

        ResultSetMetaData metaData = rs.getMetaData();
        int count = metaData.getColumnCount();

        while (rs.next()) {
            for(int i = 1 ; i <= count; i++){
                Object object = rs.getObject(i);
                System.out.print(metaData.getColumnName(i) + " = "+object + ", ");
            }
            System.out.println("");
        }
    }
}
