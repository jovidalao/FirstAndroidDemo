package com.example.firstandroiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //声明控件
    private Button myBtn1;
    private Button myBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过findviewbyid()初始化控件
        myBtn1 = (Button)findViewById(R.id.btn_1);
        myBtn2 = (Button)findViewById(R.id.btn_2);
        //匿名内部类的方法实现按钮2的点击事件.
        myBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myBtn2.setText("Button2 has been click");
            }
        });
    }
    //通过实现onClick()方法,实现按钮1的点击事件.
    public void click(View v){
        myBtn1.setText("Button1 has been click");
    }
}
