package com.example.myapplication;

/**
 * Created by 1 on 2017/9/8.
 */

public class Student <T> {
    public Student(T t) {
        this.t = t;
    }
    public Student() {
    }

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Student{" +
                "t=" + t +
                '}';
    }
 public <T extends Number> void inspect(T q) {
                 System.out.println(q+"------------------------");
     System.out.println(t+"------------------------");
            }
}
