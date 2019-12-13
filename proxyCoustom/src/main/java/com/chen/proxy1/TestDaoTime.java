package com.chen.proxy1;

import com.chen.dao.ITestDao;

/**
 * @description:
 * @author:
 */
public class TestDaoTime implements ITestDao {

    private ITestDao testDao;

    public TestDaoTime() {
    }

    public TestDaoTime(ITestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public void query() {
        System.err.println("proxy  time.......");
        testDao.query();
    }

    @Override
    public void query(String p) {

    }
}
