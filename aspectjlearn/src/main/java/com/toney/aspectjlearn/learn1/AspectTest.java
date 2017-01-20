package com.toney.aspectjlearn.learn1;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by toney on 2017/1/20.
 */

@Aspect
public class AspectTest {
    private final static String TAG = AspectTest.class.getSimpleName();

    @Before("execution(* android.app.Activity.on**(..))")
    public void injectActivityMethodBefore(JoinPoint point) throws  Throwable{
        String key = point.getSignature().toString();
        Log.e(TAG,"injectActivityOnCreateBefore : " + key);
    }

    @Around("execution(* com.toney.aspectjlearn.learn1.Learn1Activity.testAop())")
    public void injectActivityMethodAround(ProceedingJoinPoint proceedingJoinPoint) throws  Throwable{
        String key = proceedingJoinPoint.getSignature().toString();
        Log.e(TAG,"onActivityMethodAround start" + key);
        proceedingJoinPoint.proceed();
        Log.e(TAG,"onActivityMethodAround end " + key);
    }
}
