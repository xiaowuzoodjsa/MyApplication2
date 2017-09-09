package com.example.myapplication;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 1 on 2017/9/9.
 */

/**
 * 被描述的注解可用在什么地方
 */
@Target(ElementType.FIELD)
/**
 * 被描述的注解在什么范围有效
 */
@Retention(RetentionPolicy.RUNTIME)

public @interface Inface {
    int value();
}
