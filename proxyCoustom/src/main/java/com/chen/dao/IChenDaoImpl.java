package com.chen.dao;

/**
 * @description:
 * @author:
 */
public class IChenDaoImpl implements IChenDao{


    @Override
    public String proxy()throws Exception {
        System.out.println("模仿 jdk   proxy-----------------------------");
        return "proxy";
    }
}
