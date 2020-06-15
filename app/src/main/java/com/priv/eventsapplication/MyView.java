package com.priv.eventsapplication;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MyView extends BaseView {

    private static final String TAG = "kang-MyView";

    public MyView(Context context) {
        super(context);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean b = super.dispatchTouchEvent(ev);
        Log.e(TAG, "onDraw --> is" + b);
        return b;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean b = super.onTouchEvent(event);
        Log.e(TAG, "onTouchEvent -->is " + b);
        return b;
    }
}
