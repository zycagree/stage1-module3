<%--
  Created by IntelliJ IDEA.
  User: zhangyongchao
  Date: 2020/5/13
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--添加isELIgnored=false属性可以解决JSP中通过${key}获取不到ModelAndView中的值的问题}--%>

<html>
<head>
    <title>展示所有数据列表页面</title>

    <style>
        .add{
            position: absolute;
            right: 0px;
            background-color: #b0e0e6;
        }
        .resume_list{
            position: absolute;
            right: 0px;
            margin-top: 25px;
        }
    </style>

    <script>
        function add(){
            window.location.href = "add";
        }
        function edit(id){
            window.location.href="/findById?id=" + id;
        }
        function del(id){
            window.location.href="/delete?id=" + id;
        }

    </script>
</head>
<body>
<div>
    <div class="add"><input type="button" value="新增" onclick="add()"></div>
</div>
<table class="resume_list" width="100%" border="1" align="center">
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>地址</th>
        <th>电话</th>
        <th>操作</th>
    </tr>
    <c:if test="${allResumes != null && fn:length(allResumes) > 0}">
        <c:forEach items="${allResumes}" var="resume">
            <tr>
                <td>${resume.id}</td>
                <td>${resume.name}</td>
                <td>${resume.address}</td>
                <td>${resume.phone}</td>
                <td>
                    <input type="button" value="编辑" onclick="edit(${resume.id})">
                    <input type="button" value="删除" onclick="del(${resume.id})">
                </td>
            </tr>
        </c:forEach>
    </c:if>
</table>
</body>
</html>
