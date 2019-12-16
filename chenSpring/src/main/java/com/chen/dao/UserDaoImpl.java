package com.chen.dao;

/**
 * @description:
 * @author:
 */
public class UserDaoImpl implements IUserDao{
    @Override
    public String proxy() {
        System.out.println("dao..............");
        return "proxy";
    }
}
