package com.chen;

import com.chen.common.CommUtils;
import com.chen.entity.CityEntity;
import com.chen.service.ITestService;
import com.chen.service.TestServiceImpl;
import com.chen.web.TestController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * Hello world!
 *
 */
public class SpringAOPApp{
    public static void main( String[] args ) throws Exception {
        /*CityEntity cityEntity=new CityEntity();
        cityEntity.setId("1");
        cityEntity.setName("chen");
        String str=CommUtils.query(cityEntity);
        System.err.println(str);*/

        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringAOPConfig.class);
        /*TestController testController=ctx.getBean(TestController.class);
        testController.test();
        System.err.println("------------------------------------------------");
        testController.test2("chen");
        System.err.println("------------------------------------------------");
        testController.test1();*/

        ITestService testService=ctx.getBean(ITestService.class);
        testService.test();

        ITestService testServiceImpl=ctx.getBean(TestServiceImpl.class);
        testServiceImpl.test();

        System.err.println(testServiceImpl instanceof ITestService);

    }
}
