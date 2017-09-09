package com.example.a1.myapplication;

/**
 * Created by 1 on 2017/9/8.
 */

/**
 * 泛型类
 * @param <T>表示任意类型的参数
 */
public class PhoneBean <T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
