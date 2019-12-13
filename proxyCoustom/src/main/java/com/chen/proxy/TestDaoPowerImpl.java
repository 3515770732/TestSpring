package com.chen.proxy;

import com.chen.dao.TestDaoImpl;

/**
 * @description:
 * @author:
 */
public class TestDaoPowerImpl extends TestDaoImpl {

    @Override
    public void query(){
        System.err.println("power.......");
        super.query();
    }
}
