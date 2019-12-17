package com.chen.dao;

/**
 * @description:
 * @author:
 */
public class UserDaoImpl1 implements IUserDao{
    @Override
    public String proxy() {
        System.out.println("dao1111..............");
        return "proxy";
    }
}
