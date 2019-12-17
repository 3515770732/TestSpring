package com.chen;

import com.chen.service.IUserService;
import com.chen.utils.BeanFactory;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@ComponentScan("com.chen")
public class ChenSpringApp {
    public static void main(String[] args) throws Exception {
        BeanFactory beanFactory = new BeanFactory("spring.xml");

        IUserService userService=(IUserService) beanFactory.getBean("service");
        userService.find();
    }
}
