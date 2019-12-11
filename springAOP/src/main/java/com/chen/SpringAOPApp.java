package com.chen;

import com.chen.common.CommUtils;
import com.chen.entity.CityEntity;
import com.chen.web.TestController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class SpringAOPApp{
    public static void main( String[] args )
    {
        CityEntity cityEntity=new CityEntity();
        cityEntity.setId("1");
        cityEntity.setName("chen");
        String str=CommUtils.query(cityEntity);
        System.err.println(str);
    }
}
