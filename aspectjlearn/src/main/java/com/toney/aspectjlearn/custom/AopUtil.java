package com.toney.aspectjlearn.custom;


import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by toney on 2017/1/20.
 */

@Aspect
public class AopUtil {
    private final static String TAG = AopUtil.class.getSimpleName();

    @Pointcut("execution(@com.toney.aspectjlearn.custom.DebugTool * *(..))")
    public void DebugToolMethod(){}

    @Before("DebugToolMethod()")
    public void onDebugToolMethodBefore(JoinPoint point) throws Throwable{
        String key = point.getSignature().toString();
        Log.e(TAG,key);
    }

    @Pointcut("withincode(* com.toney.aspectjlearn.custom.CustomPointCutActivity.testAop2(..))")
    public void invokeAop2(){}

    @Pointcut("call(* com.toney.aspectjlearn.custom.CustomPointCutActivity.testAop3(..))")
    public void invokeAop3(){}


    //限定范围 进行与运算
    @Pointcut("invokeAop2() && invokeAop3()")
    public void invokeAop3OnlyAop2(){}


    @Before("invokeAop3OnlyAop2()")
    public void beforeInvokeAopOnlyInAop2(JoinPoint point){
        String key = point.getSignature().toString();

        Log.e(TAG, "beforeInvokeAopOnlyInAop2: " + key);
    }

    //异常处理 AfterThrowing 处理程序没有处理的异常,但是不是完全处理异常，还会传递到上层调用者jvm
    @AfterThrowing(pointcut = "execution(* com.toney.aspectjlearn.custom..*.*(..))" ,throwing = "e")
    public void catchExceptionMethod(Exception e){

        String msg = e.getMessage();
        Log.e(TAG,"catchExceptionMethod : " + msg);
    }

    /**
     * 内部类和匿名内部类 切入
     *
     * com.toney.aspectjlearn.custom.CustomPointCutActivity$1.onClick(*) 指定具体完整类名 指定方法
     * com.toney.aspectjlearn.custom.CustomPointCutActivity*.*.onClick(*) 指定类名前缀
     * com.toney.aspectjlearn.custom.CustomPointCutActivity*.onClick(*) 指定接口名前缀（注意）
     * com.toney.aspectjlearn.custom..*.onClick(*) 指定包名下及其子包名下 任何类 指定方法
     *
     *
    */
    @Before("execution(* com.toney.aspectjlearn.custom.CustomPointCutActivity$1.onClick(*)) || execution(* com.toney.aspectjlearn.custom.CustomPointCutActivity.testAop4())")
    public void innerClassMethodBefore(JoinPoint point){
        String key = point.getSignature().toString();
        Log.e(TAG, "innerClassMethodBefore: " + key);
    }


}
