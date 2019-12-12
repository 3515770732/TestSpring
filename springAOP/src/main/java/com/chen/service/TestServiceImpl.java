package com.chen.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:
 */
@Service
@Primary
public class TestServiceImpl  implements ITestService{

    @Override
    public void test() {
    System.err.println("service====test....");
    }

    @Override
    public void test1(String name) {
        System.err.println("service====test1...."+name);
    }
}
