package com.example.dell.mvp_dangnhap.view.DangNhap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dell.mvp_dangnhap.R;
import com.example.dell.mvp_dangnhap.presenter.DangNhap.LogicKiemTraDangNhap;

public class MainActivity extends AppCompatActivity implements MainView{
    Button btnLogin;
    EditText edUser,edPass;
    LogicKiemTraDangNhap logicKiemTraDangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btn_dang_nhap);
        edUser = findViewById(R.id.tai_khoan);
        edPass = findViewById(R.id.mat_khau);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user,pass;
                user = edUser.getText().toString();
                pass = edPass.getText().toString();
                logicKiemTraDangNhap.KiemTraDangNhap(user,pass);
            }
        });
        logicKiemTraDangNhap = new LogicKiemTraDangNhap(this);
    }

    @Override
    public void DangNhapThanhCong(String thongbao) {
        Toast.makeText(MainActivity.this,thongbao + " Login success!!!",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void DangNhapThatBai() {
        Toast.makeText(MainActivity.this,"Login Fail",Toast.LENGTH_SHORT).show();

    }
}
