package com.wei.fragmentbestpractice;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by weiyilin on 16/3/2.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
}
