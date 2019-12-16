package com.chen.dao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description:
 * @author:
 */
public interface CoustomInvocationHandler {

    public Object invoke(Method method) throws InvocationTargetException, IllegalAccessException;
}
