<%--
  Created by IntelliJ IDEA.
  User: zhangyongchao
  Date: 2020/5/16
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>修改编辑页面</title>
    </head>
    <body>
        <h1>编辑</h1>

        <form action="/update" method="post">
            <div>
                ID: <input type="text" name="id" value="${resume.id}" readonly unselectable="on">
            </div>
            <div>
                姓名: <input type="text" name="name" value="${resume.name}">
            </div>
            <div>
                地址: <input type="text" name="address" value="${resume.address}">
            </div>
            <div>
                手机号: <input type="text" name="phone" value="${resume.phone}">
            </div>
            <div style="width:100px;height:100px">
                <input type="submit" value=保存>
            </div>
        </form>

    </body>
</html>
