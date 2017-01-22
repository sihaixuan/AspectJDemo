package com.toney.aspectjlearn.custom.runtime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by toney on 2017/1/22.
 */

@Aspect
public class MethodRunTimeAop {
    private final static String TAG = MethodRunTimeAop.class.getSimpleName();

    private long startTime;

    @Pointcut("execution(@com..MethodRunTime * *(..))")
    public void runTime(){}

    @Before("runTime()")
    public void methodStart(JoinPoint joinPoint){
        startTime = System.currentTimeMillis();
    }
    @After("runTime()")
    public void methodEnd(JoinPoint joinPoint){
        String log = joinPoint.getSignature().toShortString() + " run times :" + (System.currentTimeMillis() - startTime) + " ms.";
        System.out.println(log);
    }
}
