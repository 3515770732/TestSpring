package com.chen.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author:
 */
public class MyJDKInvocationHandler implements InvocationHandler {
    Object target;
    public MyJDKInvocationHandler(Object target){
        this.target=target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("MyJDKInvocationHandler jdk------------------------");
        return method.invoke(target,args);
    }
}
