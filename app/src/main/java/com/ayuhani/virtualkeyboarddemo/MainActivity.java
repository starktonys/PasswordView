package com.ayuhani.virtualkeyboarddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ayuhani.virtualkeyboarddemo.alipay.AliPayActivity;
import com.ayuhani.virtualkeyboarddemo.normal.NormalActivity;
import com.ayuhani.virtualkeyboarddemo.wechat.WeChatPayActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_0, R.id.btn_1, R.id.btn_2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_0:
                startActivity(new Intent(this, NormalActivity.class));
                break;
            case R.id.btn_1:
                startActivity(new Intent(this, WeChatPayActivity.class));
                break;
            case R.id.btn_2:
                startActivity(new Intent(this, AliPayActivity.class));
                break;
        }
    }
}
