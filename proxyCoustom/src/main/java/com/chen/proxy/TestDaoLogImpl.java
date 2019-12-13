package com.chen.proxy;

import com.chen.dao.TestDaoImpl;

/**
 * @description:
 * @author:
 */
public class TestDaoLogImpl extends TestDaoImpl {

    @Override
    public void query(){
        System.err.println("log.......");
        super.query();
    }
}
