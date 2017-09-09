package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Student<String> objectStudent = new Student<>("1111111111");
        objectStudent.setT("----------------------------");
        System.out.println(objectStudent.getT());
       // Teacher<Integer> integerTeacher = new Teacher<>();
        //integerTeacher.setT(11111);
        //integerTeacher.show();
    }
}
