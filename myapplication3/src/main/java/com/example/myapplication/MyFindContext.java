package com.example.myapplication;

import android.app.Activity;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by 1 on 2017/9/9.
 */

public class MyFindContext {

    public static Class<?> aClass;

    public static void find(Activity activity){
        aClass = activity.getClass();
        initView(activity);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    static void initView(Activity activity) {
        MContentView annotation = aClass.getAnnotation(MContentView.class);
        if (annotation!=null){
            int i = annotation.setOnContex();

            try {
                aClass.getMethod("setContentView",Integer.TYPE).invoke(activity,i);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

    }
}
