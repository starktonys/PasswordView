package com.ayuhani.virtualkeyboarddemo.alipay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.ayuhani.virtualkeyboarddemo.OnPasswordFinishedListener;
import com.ayuhani.virtualkeyboarddemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AliPayActivity extends AppCompatActivity implements OnPasswordFinishedListener {

    @BindView(R.id.ll_parent)
    LinearLayout llParent;
    private AliPayWindow aliPayWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ali_pay);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_pay)
    public void onViewClicked() {
        aliPayWindow = new AliPayWindow(this);
        aliPayWindow.setOnPasswordFinishedListener(this);
        aliPayWindow.show(llParent);
    }

    @Override
    public void onFinish(String password) {
        Toast.makeText(this, "你输入的密码是：" + password, Toast.LENGTH_SHORT).show();
        aliPayWindow.dismiss();
    }
}
