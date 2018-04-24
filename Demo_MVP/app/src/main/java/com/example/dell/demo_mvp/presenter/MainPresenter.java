package com.example.dell.demo_mvp.presenter;

// dùng để xử lý cá logic, nhận dữ liệu từ lớp model thông qua các hàm callback
// nhiệm vụ đẩy lên View hướng dẫn cách View hiển thị

import com.example.dell.demo_mvp.model.LoadDemoListener;
import com.example.dell.demo_mvp.model.UserInterator;
import com.example.dell.demo_mvp.model.entity.Demo;
import com.example.dell.demo_mvp.view.MainView;

import java.util.List;
public class MainPresenter implements LoadDemoListener {
    private UserInterator mainInterator;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        mainInterator = new UserInterator(this);
    }

    public void loadData() {
        mainInterator.createListData();
    }


    @Override
    public void onLoadDemoSuccess(List<Demo> demoList) {
            mainView.displayMain(demoList);
    }

    @Override
    public void onLoadDemoFailure(String message) {

    }
}
