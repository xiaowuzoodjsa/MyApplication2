package com.example.myapplication;

import android.app.Activity;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by 1 on 2017/9/9.
 */

public class MyFind {


    private static Class<?> aClass;

    /**
     * 找activity
     */
    public static void find(Activity activity){
        aClass = activity.getClass();
        /**
         * 
         */
        initView(activity);
    }

    private static void initView(Activity activity) {
        //返回字段数组
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field key:declaredFields) {
            /**
             * 返回指定类型的注解
             */
            Inface annotation = key.getAnnotation(Inface.class);
            if (annotation!=null){
                //获取到的id
                int value = annotation.value();
                try {
                    Object view = aClass.getMethod("findViewById", Integer.TYPE).invoke(activity, value);
                    key.set(activity,view);
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
    static class MyInvocationHandler implements InvocationHandler{

        private Method method;
        private Object object;
        public MyInvocationHandler(Object object,Method method) {
            super();
            this.method=method;
            this.object=object;
        }

        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
            return this.method.invoke(object,objects);
        }
    }
}
