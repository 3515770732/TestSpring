package com.chen.service;

import com.chen.dao.IUserDao;

/**
 * @description:
 * @author:
 */
public class UserServiceImpl implements IUserService {
    IUserDao userDao;


    @Override
    public void find() {
        System.out.println("service.......");
        userDao.proxy();
    }
}
