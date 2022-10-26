package dao.impl;

import dao.BeanDao;

public class BeanDaoImpl implements BeanDao {

    public BeanDaoImpl(){
        System.out.println("[BeanDao] - Construct run....");
    }

    public void save(){
        System.out.println("[BeanDao].save() - run... ");
    }
}
