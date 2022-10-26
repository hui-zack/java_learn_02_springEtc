package dao.impl;

import dao.BeanLifeCycleDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/* 9-1 实现Spring的InitializingBean, DisposableBean接口, 完成生命周期函数设置 */
public class BeanLifeCycleDaoImpl__Interface implements BeanLifeCycleDao , InitializingBean, DisposableBean {
    private String name;
    @Override
    public void save() {

        System.out.println("[BeanLifeCycleDaoImpl__Interface].save() run...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("[BeanLifeCycleDaoImpl__Interface].set() set name");
        this.name = name;
    }

    @Override
    /* 析构函数*/
    public void destroy() throws Exception {
        System.out.println("[BeanLifeCycleDaoImpl__Interface].destroy() destroy...");
    }


    @Override
    /* 初始化函数 */
    public void afterPropertiesSet() throws Exception {
        System.out.println("[BeanLifeCycleDaoImpl__Interface].init() init...");
    }
}
