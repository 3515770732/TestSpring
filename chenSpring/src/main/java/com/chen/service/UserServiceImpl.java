package com.chen.service;

import com.chen.dao.IUserDao;
import com.chen.dao.UserDaoImpl;

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
