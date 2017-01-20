package com.toney.aspectjlearn.learn1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.toney.aspectjlearn.R;

/**
 * Created by toney on 2017/1/20.
 */

public class Learn1Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
        testAop();
    }

    public void testAop(){
        Log.e("toney","testAop");
    }
}
