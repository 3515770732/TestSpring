package com.chen.aspect;

/**
 * @description:
 * @author:
 */
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectJ {

    @Pointcut("execution(* com.chen..*.*(..))")
    //@Pointcut("args(java.lang.String)")
    //@Pointcut("within(com.chen.service.*)")
    //@Pointcut("@annotation(com.chen.anno.Chen)")
    public void pointcut(){

    }


    @Before("pointcut()")
    public void before(){
        System.err.println("aop----before");
    }


    @After("pointcut()")
    public void after(){
        System.err.println("aop----after");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing(){
        System.err.println("aop----afterThrowing");
    }

    @AfterReturning("pointcut()")
    public void AfterReturning(){
        System.err.println("aop----afterReturning");
    }
}
