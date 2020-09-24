package com.example.wangpu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //主页面加载java代码
    }
    public void butt(View v){  //单击按钮事件
        AlertDialog alertDialog1 = new AlertDialog.Builder(this)
                .setTitle("提示")//标题
                .setMessage("王子涵是个帅哥")//内容
                .setIcon(R.mipmap.ic_launcher)//图标
                .create();
        alertDialog1.show();
    }

}
