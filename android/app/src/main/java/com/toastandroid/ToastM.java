package com.toastandroid;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by uztek001 on 2018/3/23.
 */

public class ToastM extends ReactContextBaseJavaModule {
    private static final String SHORT = "SHORT";
    private static final String LONG = "LONG";

    public ToastM(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ToastM";
    }

    @ReactMethod
    public void show(String message,int time){
        Toast.makeText(this.getReactApplicationContext(),message,time).show();
    }

    @Override
    public Map<String, Object> getConstants() {//设置JS可以使用的常量
        Map<String, Object> Constants = new HashMap<>();
        Constants.put(SHORT, Toast.LENGTH_SHORT);
        Constants.put(LONG, Toast.LENGTH_LONG);
        return Constants;
    }
}
