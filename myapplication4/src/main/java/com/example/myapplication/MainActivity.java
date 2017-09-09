package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
@MyContext(R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Inface(R.id.vdd)
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        MyFindId.find(this);
       //button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,"自定义注解",Toast.LENGTH_SHORT).show();
    }
}
