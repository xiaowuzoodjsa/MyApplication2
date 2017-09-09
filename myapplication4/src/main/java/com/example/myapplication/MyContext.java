package com.example.myapplication;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 1 on 2017/9/9.
 */
@Target(ElementType.TYPE)

@Retention(RetentionPolicy.RUNTIME)

public @interface MyContext {
    int value();
}
