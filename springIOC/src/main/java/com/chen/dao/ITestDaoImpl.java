package com.chen.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @description:
 * @author:
 */
@Lazy
@Component
public class ITestDaoImpl implements ITestDao, InitializingBean, DisposableBean {

    public ITestDaoImpl() {
        System.err.println("Constructor......");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println("init......");
    }

    @Override
    public void destroy() throws Exception {
        System.err.println("destroy......");
    }

    @PostConstruct
    public void init(){
        System.err.println("init and  destroy......");
    }
}
