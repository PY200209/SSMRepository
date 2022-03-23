package com.my.domain;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Date;

@org.aspectj.lang.annotation.Aspect
public class Aspect {
    @Pointcut("execution(* *..Aop*.getADD(..))")
    public  void one(){

    }
   /* @Before("execution(* *..Aop*.getADD(..))")
    public void ByBefore(JoinPoint joinPoint){
        System.out.println("这是前置通知的切面，时间: "+new Date());
        System.out.println("这是目标方法的全限定名称"+joinPoint.getSignature());
    }*/
   /* @AfterReturning(value = "one()",returning = "x")
    public void ByAR(JoinPoint joinPoint,Object x){
        System.out.println("这是afterReturning通知的切面，且这是目标方法的返回值：  "+x);

    }*/
    @Around("one()")
    public Object ByAround(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("这是通过环绕通知的方式");
        System.out.println("这是前置功能，时间： "+new Date());
        Object result = pj.proceed();
        System.out.println("这是后置功能，事务已完成");
        return  result;
    }
}
