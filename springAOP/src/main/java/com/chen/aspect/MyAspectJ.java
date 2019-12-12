package com.chen.aspect;

/**
 * @description:
 * @author:
 */
import com.chen.service.ITestService;
import com.chen.service.ITestServiceB;
import com.chen.service.TestServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
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

    @DeclareParents(value="com.chen.service.*", defaultImpl= TestServiceImpl.class)
    public static ITestService testService;

    @Before("pointcut()")
    public void before(){
        System.err.println("aop----before");
    }


    //@After("pointcut()")
    public void after(){
        System.err.println("aop----after");
    }

    //@AfterThrowing("pointcut()")
    public void afterThrowing(){
        System.err.println("aop----afterThrowing");
    }

    //@AfterReturning("pointcut()")
    public void AfterReturning(){
        System.err.println("aop----afterReturning");
    }

    //@Around("pointcut()")
    public void Around(ProceedingJoinPoint point) throws Throwable {
        System.err.println("ProceedingJoinPoint before around============"+point.getThis());
        Object[] obj=new Object[point.getArgs().length];
        if(obj!=null && obj.length>0){
            obj[0]="456";
            point.proceed(obj);
        }else {
            point.proceed();
        }
        System.err.println("ProceedingJoinPoint after around============="+point.getTarget());
    }

    //@Around("pointcut()")
    public void Around1(JoinPoint point) throws Throwable {
        System.err.println("joinPoint before around======================"+point.getThis());
        System.err.println("joinPoint after around======================="+point.getTarget());
    }
}
