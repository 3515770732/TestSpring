package com.chen.web;

import com.chen.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

/**
 * @description:
 * @author:
 */
@Controller
public class TestController  {

    /**
     * @Resource  by Name(根据属性名 ，则选择TestServiceImpl2 类,如果匹配不到，则报错)
     *
     * @Autowired by Type  (所有如果有两个实现了相同类的bean,系统会报错，
     *                      需要指定默认选哪个(其中一个设置为@Primary，默认既加载这个类))
     */
    @Autowired
    ITestService testService;

    public void test(){
        System.err.println("web====");
        testService.test();
    }
}
