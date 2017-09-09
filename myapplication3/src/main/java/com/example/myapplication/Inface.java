package com.example.myapplication;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 1 on 2017/9/9.
 */

//表示注解的适用范围

/**
 * ElementType.FIELD用于描述域
 */
@Target(ElementType.FIELD)

//标注注解的生命周期 在什么时候使用有用
/**
 * RetentionPolicy.CLASS限制在class里边使用
 * RetentionPolicy.RUNTIME在运行时使用
 * RetentionPolicy.SOURCE在源文件中使用
 */
@Retention(RetentionPolicy.RUNTIME)
/**
 * 自定义注解的格式
 * public @interface 注解名{ 定义方法体}
 */
public @interface Inface {
    int value();
}
