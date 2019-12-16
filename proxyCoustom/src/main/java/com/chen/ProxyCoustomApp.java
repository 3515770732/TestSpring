package com.chen;

import com.chen.dao.IChenDao;
import com.chen.dao.IChenDaoImpl;
import com.chen.dynamicProxy.jdk.MyJDKInvocationHandler;
import com.chen.dynamicProxy.jdk.ProxyUtil;
import com.chen.dynamicProxy.jdk.TestCustomHandler;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 */
public class ProxyCoustomApp {
    public static void main(String[] args) {
        //静态代理-------------------------------------------------------------------------
        //继承
        /*ITestDao testDao=new TestDaoLogImpl();
        testDao.query();
        System.err.println("------------------------");
        ITestDao testDao1=new TestDaoPowerImpl();
        testDao1.query();
        System.err.println("------------------------");

        //聚合
        ITestDao proxy1=new TestDaoLog(new TestDaoImpl());
        proxy1.query();
        System.err.println("------------------------");
        ITestDao proxy2=new TestDaoTime(new TestDaoImpl());
        proxy2.query();


        //多种聚合
        ITestDao proxy=new TestDaoLog(new TestDaoImpl());
        ITestDao proxy1=new TestDaoTime(proxy);
        proxy1.query();
        System.err.println("------------------------");
        ITestDao proxy2=new TestDaoTime(new TestDaoImpl());
        ITestDao proxy3=new TestDaoLog(proxy2);
        proxy3.query();

        */


        //动态代理
        //jdk动态代理
        IChenDao chenDao=(IChenDao) Proxy.newProxyInstance(IChenDao.class.getClassLoader(),
                new Class[]{IChenDao.class},new MyJDKInvocationHandler(new IChenDaoImpl()));
        try {
            chenDao.proxy();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.err.println("------------------------");
        //自己模拟jdk动态代理
        IChenDao chenDao1= (IChenDao)ProxyUtil.newInstance(IChenDao.class,new TestCustomHandler(new IChenDaoImpl()));
        try {
            chenDao1.proxy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
