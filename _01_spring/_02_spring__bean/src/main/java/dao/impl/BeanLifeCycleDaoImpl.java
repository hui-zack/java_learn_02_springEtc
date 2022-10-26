package dao.impl;

import dao.BeanLifeCycleDao;
/* 8-1 配置初始化函数和析构函数 */
public class BeanLifeCycleDaoImpl implements BeanLifeCycleDao {
    public void save(){
        System.out.println("[BeanLifeCycleDao].save() run...");
    }

    public BeanLifeCycleDaoImpl(){
        init();
    }

    /* 初始化函数 */
    public void init(){
        System.out.println("[BeanLifeCycleDao] init...");
    }

    /* 析构函数 */
    public void destroy(){
        System.out.println("[BeanLifeCycleDao] destroy...");
    }




}
