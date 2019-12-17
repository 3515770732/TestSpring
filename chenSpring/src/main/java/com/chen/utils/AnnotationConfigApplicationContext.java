package com.chen.utils;

import com.chen.anno.Chen;

import java.io.File;

/**
 * @description:
 * @author:
 */
public class AnnotationConfigApplicationContext {

    public void scan(String basePackage){
        String rootPath = this.getClass().getResource("/").getPath();
        String  basePackagePath =basePackage.replaceAll("\\.","\\\\");
        File file = new File(rootPath+"//"+basePackagePath);
        String names[]=file.list();
        for(String name:names){
            name=name.replace(".class","");
            try {
                Class clazz=Class.forName(basePackage+"."+name);
                if(clazz.isAnnotationPresent(Chen.class)){
                    Chen chen= (Chen) clazz.getAnnotation(Chen.class);
                    System.out.println(chen.value());
                    System.out.println(clazz.newInstance());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }

        }

    }
}
