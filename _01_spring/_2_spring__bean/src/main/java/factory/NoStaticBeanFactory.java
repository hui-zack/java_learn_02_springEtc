package factory;

import dao.BeanDao;
import dao.impl.BeanDaoImpl;

public class NoStaticBeanFactory {
    /* 6-1 实例Bean工厂的成员方法获取Bean对象 */
    public BeanDao getBeanDao(){
        return new BeanDaoImpl();
    }
}
