package com.example.myapplication;

/**
 * Created by 1 on 2017/9/9.
 */

public class Teacher <T extends Number> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    void show(){
        System.out.println(t);
    }
}
