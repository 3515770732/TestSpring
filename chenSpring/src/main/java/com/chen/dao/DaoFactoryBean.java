package com.chen.dao;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author:
 * 实现了FactoryBean的类，在spring容器中存在两个对象
 * ①当前对象 :"&"+当前类指定的名字，即&daoFactoryBean
 * ②getObject()方法返回的对象:拿到的是当前类指定的名字，即daoFactoryBean
 */
@Component
public class DaoFactoryBean implements FactoryBean {
    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void testBean(){
        System.out.println("1111111");
    }
    @Override
    public Object getObject() throws Exception {
        TempDaoFactoryBean factoryBean=new TempDaoFactoryBean();
        String msgs[]=msg.split(",");
        factoryBean.setMsg1(msgs[0]);
        factoryBean.setMsg2(msgs[1]);
        factoryBean.setMsg3(msgs[2]);
        return factoryBean;
    }

    @Override
    public Class<?> getObjectType() {
        return TempDaoFactoryBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
