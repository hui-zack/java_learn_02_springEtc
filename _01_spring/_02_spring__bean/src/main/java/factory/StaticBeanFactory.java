package factory;

import dao.BeanDao;
import dao.impl.BeanDaoImpl;

public class StaticBeanFactory {
    /* 5-1 静态工厂类的成员方法获取Bean对象 */
    public static BeanDao getBeanDao(){
        return new BeanDaoImpl();
    }
}
