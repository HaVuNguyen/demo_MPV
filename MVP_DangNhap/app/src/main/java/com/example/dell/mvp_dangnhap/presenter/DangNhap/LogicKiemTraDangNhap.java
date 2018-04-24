package com.example.dell.mvp_dangnhap.presenter.DangNhap;

import com.example.dell.mvp_dangnhap.view.DangNhap.MainView;

public class LogicKiemTraDangNhap implements ImplementKiemTraDangNhap {

    MainView mainView;
    public LogicKiemTraDangNhap(MainView mainView){
        this.mainView = mainView;
    }

    @Override
    public void KiemTraDangNhap(String user,String pass){

        if (user.equals("user") && pass.equals("123")){
            mainView.DangNhapThanhCong(user);

        }else{
            mainView.DangNhapThatBai();

        }


    }
}
