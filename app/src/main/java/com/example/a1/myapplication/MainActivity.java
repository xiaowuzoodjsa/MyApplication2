package com.example.a1.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btu_1;
    private Button btu_2;
    private ArrayList list;
    private ArrayList<String> list1;
    private TextView tv;
    private Button btu_jiekou;
    private Student<Teacther> teactherStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teactherStudent = new Student<>();
        teactherStudent.setT(new Teacther());

        /**
         * 没有泛型
         * 没有约束力
         * 可以添加各种类型的数据
         * 在获取的时候可能会因为数据类型强转错误，报错
         * 我们在添加的参数1为String类型，参数2为 int类型
         * 如果我们 误把int类型的参数强转为String类型，运行时会报错（  java.lang.ClassCastException:）类型转换错误
         */
        list = new ArrayList();
        list.add("小五");
        list.add(1);


        /**
         * 有泛型
         * 具有约束力
         * 泛型是什么数据类型
         * 就只能添加这种数据类型
         */
        list1 = new ArrayList<String>();
        list1.add("nihao");
        list1.add("去你妈的");

        btu_1 = (Button) findViewById(R.id.btu_1);
        initView();
    }

    private void initView() {
        tv = (TextView) findViewById(R.id.tv);
        btu_1 = (Button) findViewById(R.id.btu_1);
        btu_2 = (Button) findViewById(R.id.btu_2);
        btu_jiekou = (Button) findViewById(R.id.jiekou);
        btu_1.setOnClickListener(this);
        btu_2.setOnClickListener(this);
        btu_jiekou.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btu_1:
                //没有泛型必须做强转
                String o = (String) list.get(1);
                tv.setText(o);
                break;
            case R.id.btu_2:
                String s = list1.get(0);
                tv.setText(s);
                break;
            case R.id.jiekou:
                CallBackImpl callBack=new CallBackImpl();
                callBack.show("你好");
                break;
        }
    }
}
