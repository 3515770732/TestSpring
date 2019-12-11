package com.chen;

import com.chen.service.ITestService;
import com.chen.service.TestServiceImpl2;
import com.chen.web.TestController;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIOCApp
{
    public static void main( String[] args )
    {
        //AnnotationConfigApplicationContext  默认开启注解
       /* AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(SpringIOCConfig.class);
        TestController testController=ctx.getBean(TestController.class);
        testController.test();*/



        //设置默认环境
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev2");
        //3、指定模式后，再注册Bean
        ctx.register(SpringIOCConfig.class);
        //4、刷新容器，注册生效。
        ctx.refresh();

        TestController testController=ctx.getBean(TestController.class);
        testController.test();
    }
}
