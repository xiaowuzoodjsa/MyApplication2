package com.example.myapplication;

import android.app.Activity;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by 1 on 2017/9/9.
 */

public class MyFindId {

    private static Class<? extends Activity> aClass;

    public static void findid(Activity activity){
        aClass = activity.getClass();

        initView(activity);
   }

    private static void initView(Activity activity) {
        /**返回类中所有字段，包括公共、保护、默认（包）访问和私有字段，但不包括继承的字段
         * entity.getFields();只返回对象所表示的类或接口的所有可访问公共字段
         * 在class中getDeclared**()方法返回的都是所有访问权限的字段、方法等；
         * 可看API
         * */
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field tr:declaredFields) {
            /**
             * 返回字段中所包含的注解
             */
            Findid annotation = tr.getAnnotation(Findid.class);
            if (annotation!=null) {
                int value = annotation.value();
                try {
                    Object view = aClass.getMethod("findViewById", Integer.TYPE).invoke(activity, value);
                    tr.set(activity,view);
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
