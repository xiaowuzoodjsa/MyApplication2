package com.example.a1.myapplication;


import android.widget.Toast;

/**
 * Created by 1 on 2017/9/8.
 */

public class CallBackImpl implements CallBack<String> {
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
