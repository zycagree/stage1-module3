package com.zyc.demo.service.impl;

import com.zyc.demo.service.IDemoService;
import com.zyc.mvcframework.annotations.CustomService;

@CustomService("demoService")
public class DemoServiceImpl implements IDemoService {
    @Override
    public String get(String name) {
        System.out.println("service 实现类中的name参数：" + name) ;
        return name;
    }
}
