package com.newer.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

@Aspect
@Service("logAspect")
public class LogAspect {
    @Pointcut("execution(* com.newer.service.*.*(..))")
    public void anyMethod(){

    }
    @Before("anyMethod()")
    public void before(JoinPoint joinPoint){
        String name=joinPoint.getSignature().getName();
        System.out.println(name+"方法的前置通知");
    }
@AfterReturning("anyMethod()")
    public void afterMethod(JoinPoint joinPoint){
        String name=joinPoint.getSignature().getName();
        System.out.println(name+"方法的后置通知");
    }
    @After("anyMethod()")
public void after(){
        System.out.println("最终通知");
    }
//    @AfterThrowing("anyMethod()")
//    public void afterThrowing(){
//
//    }

}
