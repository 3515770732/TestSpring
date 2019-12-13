package com.chen.proxy1;

import com.chen.dao.ITestDao;

/**
 * @description:
 * @author:
 */
public class TestDaoLog implements ITestDao {

    private ITestDao testDao;

    public TestDaoLog(ITestDao testDao) {
        this.testDao = testDao;
    }

    public TestDaoLog() {
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
