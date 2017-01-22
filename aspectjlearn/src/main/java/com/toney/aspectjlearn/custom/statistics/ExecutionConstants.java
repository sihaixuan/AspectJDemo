package com.toney.aspectjlearn.custom.statistics;

/**
 * Created by toney on 2017/1/22.
 */

public interface ExecutionConstants {
    String ACTIVITY_ON_CREATE = "execution(* com..custom..onCreate(..))";
    String ACTIVITY_ON_RESUME = "execution(* com..custom..onResume(..))";
    String ACTIVITY_ON_START = "execution(* com..custom..onStart(..))";
    String ACTIVITY_ON_PAUSE = "execution(* com..custom..onPause(..))";
    String ACTIVITY_ON_STOP = "execution(* com..custom..onStop(..))";
    String ACTIVITY_ON_DESTORY = "execution(* com..custom..onDestory(..))";
}
