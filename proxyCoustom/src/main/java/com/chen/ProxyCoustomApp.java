package com.chen;

import com.chen.dao.ITestDao;
import com.chen.dao.TestDaoImpl;
import com.chen.proxy.TestDaoLogImpl;
import com.chen.proxy1.TestDaoLog;
import com.chen.proxy1.TestDaoTime;

/**
 * Hello world!
 */
public class ProxyCoustomApp {
    public static void main(String[] args) {
        /*ITestDao testDao=new TestDaoLogImpl();
        testDao.query();
        System.err.println("------------------------");

        ITestDao proxy=new TestDaoLog(new TestDaoImpl());
        ITestDao proxy1=new TestDaoTime(proxy);
        proxy1.query();
        System.err.println("------------------------");
        ITestDao proxy2=new TestDaoTime(new TestDaoImpl());
        ITestDao proxy3=new TestDaoLog(proxy2);
        proxy3.query();

        System.err.println("------------------------");*/
        ITestDao proxyDap=(ITestDao)ProxyUtils.getInstance(ITestDao.class);
        proxyDap.query();
        proxyDap.query("chen");
    }
}
