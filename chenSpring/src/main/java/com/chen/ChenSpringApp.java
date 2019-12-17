package com.chen;

import com.chen.dao.DaoFactoryBean;
import com.chen.dao.TempDaoFactoryBean;
import com.chen.service.IUserService;
import com.chen.utils.AnnotationConfigApplicationContext;
import com.chen.utils.BeanFactory;

/**
 * Hello world!
 */
public class ChenSpringApp {
    public static void main(String[] args) throws Exception {
        //自己模拟写xml
        /*BeanFactory beanFactory = new BeanFactory("spring.xml");

        IUserService userService=(IUserService) beanFactory.getBean("service");
        userService.find();*/


       /* AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ChenSpringConfig.class);
        TempDaoFactoryBean daoFactoryBean=(TempDaoFactoryBean)applicationContext.getBean("daoFactoryBean");
        //DaoFactoryBean daoFactoryBean=(DaoFactoryBean)applicationContext.getBean("&daoFactoryBean");
        daoFactoryBean.testBean();
        System.err.println(daoFactoryBean.getMsg1());
        System.err.println(daoFactoryBean.getMsg2());
        System.err.println(daoFactoryBean.getMsg3());*/

        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
        applicationContext.scan("com.chen.service");

    }
}
