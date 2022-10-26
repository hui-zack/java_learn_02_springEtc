package hui.config;

import com.alibaba.druid.pool.DruidDataSource;
import hui.depend.DataSourceDepend;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/* 1-1 编写第三方的类 */
public class JdbcConfig {
    /* 1-5 JdbcConfig中注入基本数据类型数据 */
    @Value("${jdbc.driverClassName}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Override
    public String toString() {
        return "JdbcConfig{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    /* 1-3 第三方的类中方法添加@bean注解 */
    @Bean
    public DataSource dataSource(DataSourceDepend dataSourceDepend){  /* 1-6 JdbcConfig中注入引用数据类型数据 */
//  注入引用类型只需要为bean定义方法设置形参即可, 如: DataSourceDepend dataSourceDepend, 容器会根据类型自动装配对象
        DruidDataSource ds = new DruidDataSource();

        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        System.out.println(this.toString());
        System.out.println("DataSource(Bean)注入的引用类型对象 = " + dataSourceDepend);
        return ds;
    }
}
