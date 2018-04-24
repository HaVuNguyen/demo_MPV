package com.example.dell.demo_mvp.model;

//xử lý dữ liệu -> trả dữ liệu về presenter

import com.example.dell.demo_mvp.model.entity.Demo;
import com.example.dell.demo_mvp.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

public class UserInterator {
    private MainPresenter listener;

    public UserInterator(MainPresenter listener){
        this.listener = listener;
    }

    //xử lý dữ liệu
    public void createListData(){
        List<Demo> demoList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Demo demo = new Demo("Hello");
            demoList.add(demo);
        }
        listener.onLoadDemoSuccess(demoList);
    }
}
