package com.example.daidaijie.bmobapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //第一：默认初始化
        Bmob.initialize(this, BmobInfo.appID);

        Person person = new Person();
        person.setName("李宇杰");
        person.setAddress("汕头大学");

        /**
         * 保存到bmob
         */
        person.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {
                if (e==null){
                    Toast.makeText(MainActivity.this, "添加成功", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "添加失败 : "+e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
