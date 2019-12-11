package com.chen;

import com.chen.common.CommUtils;
import com.chen.entity.CityEntity;
import com.chen.service.ITestService;
import com.chen.service.TestServiceImpl;
import com.chen.web.TestController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
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

        /*ITestService testService=ctx.getBean(ITestService.class);
        testService.test();
        System.err.println(testService instanceof Proxy);
        ITestService testServiceImpl=ctx.getBean(TestServiceImpl.class);
        testServiceImpl.test();*/
        Class<?>[] ins=new Class[]{ITestService.class};
        byte bytes[]= ProxyGenerator.generateProxyClass("ChenA",ins);
        File file=new File("C:\\qa\\ChenA.class");
        FileWriter fileWriter=new FileWriter(file);
        try {
            FileOutputStream stream=new FileOutputStream(file);
            stream.write(bytes);
            fileWriter.close();
            bytes.clone();
        }catch (Exception e){

        }


    }
}
