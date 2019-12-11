package com.chen.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author:
 */
@Service
public class TestServiceImpl  implements ITestService{

    @Override
    public void test() {
    System.err.println("service====impl....");
    }
}
