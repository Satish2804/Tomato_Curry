package com.tomato.curry;

import android.app.Application;

import com.tomato.curry.Font.FontIconTypeFaceHolder;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FontIconTypeFaceHolder.init(getAssets(), "tomato-curry.ttf");
    }
}
