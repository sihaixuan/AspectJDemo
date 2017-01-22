package com.toney.aspectjlearn.custom;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.toney.aspectjlearn.R;
import com.toney.aspectjlearn.custom.runtime.MethodRunTime;

/**
 * Created by toney on 2017/1/20.
 */

public class CustomPointCutActivity extends Activity {
    @MethodRunTime
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
        testAop();
        testAop1();
        testAop2();
//        testExceptionAop();
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CustomPointCutActivity.this,"onclick",Toast.LENGTH_LONG).show();

            }
        });

        testAop4();
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

    public void testAop4(){

    }
}
