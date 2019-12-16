package com.chen.StaticProxy.proxy;

import com.chen.dao.TestDaoImpl;

/**
 * @description:静态代理---继承
 * @author:
 */
public class TestDaoPowerImpl extends TestDaoImpl {

    @Override
    public void query(){
        System.err.println("power.......");
        super.query();
    }
}
