package com.chen.StaticProxy.proxy1;

import com.chen.dao.ITestDao;

/**
 * @description:静态代理---聚合
 * @author:
 */
public class TestDaoLog implements ITestDao {

    private ITestDao testDao;

    public TestDaoLog(ITestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public void query() {
        System.err.println("proxy  log.......");
        testDao.query();
    }

    @Override
    public void query(String p) {

    }
}
