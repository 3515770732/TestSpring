package com.chen.dao;

import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author:
 */
public class TestDaoImpl implements ITestDao{

    @Override
    public void query(){
        System.err.println("假装查数据库");
    }

    @Override
    public void query(String p) {
        System.out.println(p);
    }
}
