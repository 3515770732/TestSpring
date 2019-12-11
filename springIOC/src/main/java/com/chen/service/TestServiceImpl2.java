package com.chen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:
 */
@Service
@Profile("dev2")
public class TestServiceImpl2 implements ITestService{


    @Override
    public void test() {
    System.err.println("service====impl2222....");
    }
}
