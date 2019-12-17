package com.chen.service;

import com.chen.anno.Chen;
import com.chen.dao.IUserDao;

/**
 * @description:
 * @author:
 */
@Chen("impl1")
public class UserServiceImpl1 implements IUserService {
    IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

   /* public UserServiceImpl1(IUserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void find() {
        System.out.println("service.......");
        userDao.proxy();
    }
}
