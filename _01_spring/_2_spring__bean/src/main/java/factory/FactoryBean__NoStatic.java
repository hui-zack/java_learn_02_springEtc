package factory;

import dao.BeanDao;
import dao.impl.BeanDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/* 7-1 实例工厂获取Bean的第二种方式 - FactoryBean */
public class FactoryBean__NoStatic implements FactoryBean<BeanDao> {
    @Override
    public BeanDao getObject() throws Exception {
        return new BeanDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return BeanDao.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
