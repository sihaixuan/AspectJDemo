package com.toney.aspectjlearn.custom.statistics;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by toney on 2017/1/22.
 * 不侵入原有代码的场景 埋点统计
 */

@Aspect
public class StatisticsAop {

    private final static String TAG = StatisticsAop.class.getSimpleName();

    @Before(ExecutionConstants.ACTIVITY_ON_CREATE)
    public void onActivityCreate(JoinPoint point){
        Log.e(TAG,point.getSignature().toString());
        //埋点 上报 比如友盟
    }

    @Before(ExecutionConstants.ACTIVITY_ON_START)
    public void onActivityStart(JoinPoint point){
        Log.e(TAG,point.getSignature().toString());
        //埋点 上报 比如友盟
    }

    @Before(ExecutionConstants.ACTIVITY_ON_RESUME)
    public void onActivityResume(JoinPoint point){
        Log.e(TAG,point.getSignature().toString());
        //埋点 上报 比如友盟
    }

    @Before(ExecutionConstants.ACTIVITY_ON_PAUSE)
    public void onActivityPause(JoinPoint point){
        Log.e(TAG,point.getSignature().toString());
        //埋点 上报 比如友盟
    }

    @Before(ExecutionConstants.ACTIVITY_ON_STOP)
    public void onActivityStop(JoinPoint point){
        Log.e(TAG,point.getSignature().toString());
        //埋点 上报 比如友盟
    }

    @Before(ExecutionConstants.ACTIVITY_ON_DESTORY)
    public void onActivityDestory(JoinPoint point){
        Log.e(TAG,point.getSignature().toString());
        //埋点 上报 比如友盟
    }


}
