<%--
  Created by IntelliJ IDEA.
  User: zhangyongchao
  Date: 2020/5/16
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<html>
    <head>
        <title>新增页面</title>
    </head>
    <body>
        <h1>新增</h1>

        <form action="/add" method="post">
            <div>
                <input type="text" name="name" placeholder="请输入姓名">
            </div>
            <div>
                <input type="text" name="address" placeholder="请输入地址">
            </div>
            <div>
                <input type="text" name="phone" placeholder="请输入手机号">
            </div>
            <div style="width:100px;height:100px">
                <input type="submit" value=保存>
            </div>
        </form>

    </body>
</html>
