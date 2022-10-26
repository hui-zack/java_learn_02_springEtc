package hui.service.impl;

import hui.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import hui.service.BookService;

@Component("bookDaoService")
public class BookServiceImpl implements BookService {
    /* 1-1 按类型注入bean依赖 */
    @Autowired                          // 自动装配默认为按类型装配
    private BookDao bookDao;

    /* 1-2  按bean的id名注入bean依赖 */
    @Autowired                          // 按name注入时,必须指明自动装配
    @Qualifier("bookDao2")              // 若该类型有多个实现类, 且bean-id与类型名不相同, 使用@Qualifier("bookDao")根据名称注入
    private BookDao bookDao2;

    /* 2 字符串注入 */
    @Value("test")
    private String name;

    /* 3-1 properties值注入字符串 */
    @Value("${configFileName}")
    private String configFileName;

    @Override
    public String toString() {
        return "BookServiceImpl{" +
                "bookDao=" + bookDao +
                ", bookDao2=" + bookDao2 +
                ", name='" + name + '\'' +
                ", configFileName='" + configFileName + '\'' +
                '}';
    }

    public void save() {
        System.out.println("bookServiceImpl.save | " + toString());
        bookDao.save();
        bookDao2.save();
    }
}
