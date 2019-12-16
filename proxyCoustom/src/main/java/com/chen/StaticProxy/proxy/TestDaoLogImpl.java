package com.chen.StaticProxy.proxy;

import com.chen.dao.TestDaoImpl;

/**
 * @description:  静态代理---继承
 * @author:
 */
public class TestDaoLogImpl extends TestDaoImpl {

    @Override
    public void query(){
        System.err.println("log.......");
        super.query();
    }
}
