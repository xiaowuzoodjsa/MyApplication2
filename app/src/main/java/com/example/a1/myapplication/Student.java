package com.example.a1.myapplication;

/**
 * Created by 1 on 2017/9/8.
 */

public class Student <T extends Student> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
