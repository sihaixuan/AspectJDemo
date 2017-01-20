package com.toney.aspectjlearn.custom;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.toney.aspectjlearn.R;

/**
 * Created by toney on 2017/1/20.
 */

public class CustomPointCutActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
        testAop();
        testAop1();
        testAop2();
//        testExceptionAop();
    }


    //测试 自定义aop 注解
    @DebugTool
    private void testAop(){
        Log.e("toney","testAop");
    }

    private void testAop3(){
        Log.e("toney","testAop3");
    }

    public void testAop1(){
        testAop3();
    }

    public void testAop2(){
        testAop3();
    }

    //即使有AfterThrowing 未完全处理，还是继续抛给 jvm，程序崩溃。
    public void testExceptionAop(){
        View view = null;
        view.animate();

    }
}
