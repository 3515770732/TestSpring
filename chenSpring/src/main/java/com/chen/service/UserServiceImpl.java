package com.chen.service;

import com.chen.anno.Chen;
import com.chen.dao.IUserDao;

/**
 * @description:
 * @author:
 */
@Chen("impl")
public class UserServiceImpl implements IUserService {
    IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

   /* public UserServiceImpl(IUserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void find() {
        System.out.println("service.......");
        userDao.proxy();
    }
}
