package com.zyc.demo.controller;

import com.zyc.demo.service.IDemoService;
import com.zyc.mvcframework.annotations.CustomAutowired;
import com.zyc.mvcframework.annotations.CustomController;
import com.zyc.mvcframework.annotations.CustomRequestMapping;
import com.zyc.mvcframework.annotations.Security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@CustomController
@CustomRequestMapping("/demo")
@Security({"zhangsan", "lisi"})
public class DemoController {

    @CustomAutowired
    private IDemoService demoService;

    /**
     * URL: /demo/query?name=lisi
     * @param request
     * @param response
     * @param name
     * @return
     */
    @CustomRequestMapping("/query")
    @Security("wangwu")
    public String query(HttpServletRequest request, HttpServletResponse response,String name) {
        return demoService.get(name);
    }
}
