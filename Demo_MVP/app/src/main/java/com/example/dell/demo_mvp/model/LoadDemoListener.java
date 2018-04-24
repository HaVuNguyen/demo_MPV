package com.example.dell.demo_mvp.model;

import com.example.dell.demo_mvp.model.entity.Demo;

import java.util.List;

public interface LoadDemoListener {
     void onLoadDemoSuccess(List<Demo> demoList);

     void onLoadDemoFailure(String message);
}
