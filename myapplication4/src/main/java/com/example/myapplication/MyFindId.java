package com.example.myapplication;

import android.app.Activity;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by 1 on 2017/9/9.
 */

public class MyFindId {

    private static Class<? extends Activity> aClass;

    public static void  find(Activity activity){
        //得到这个activity的Class
        aClass = activity.getClass();
        initView(activity);
        initContext(activity);
    }

    private static void initContext(Activity activity) {
        MyContext annotation = aClass.getAnnotation(MyContext.class);
        if (annotation!=null){
            int value = annotation.value();
            try {
                aClass.getMethod("setContentView",Integer.TYPE).invoke(activity,value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    private static void initView(Activity activity) {
        //返回class里所有的字段
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field f :declaredFields) {
            //返回指定的注解 如果是这个注解，否则返回空
            Inface annotation = f.getAnnotation(Inface.class);
            if (annotation!=null){
                int value = annotation.value();
                try {
                    Object view = aClass.getMethod("findViewById", Integer.TYPE).invoke(activity, value);
                    f.set(activity,view);
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
}
