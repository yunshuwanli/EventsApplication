package com.priv.eventsapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends Base {

    private static final String TAG = "kang-MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean b = super.dispatchTouchEvent(ev);
        Log.e(TAG, "dispatchTouchEvent -->" + b);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean b = super.onTouchEvent(event);
        Log.e(TAG, "onTouchEvent -->" + b);
        return b;
    }
}