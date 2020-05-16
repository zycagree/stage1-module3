<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>登录页面</title>
        <script type="text/javascript" src="/js/jquery.min.js"></script>
        <script>

        </script>
    </head>
    <body>
    <h2>登录</h2>
        <fieldset>
            <span style="color: red">${tips}</span>
            <form action="${pageContext.request.contextPath}/login" method="post">
                用户名：<input type="text" name="username"><br>
                密  码: <input type="password" name="password"><br>
                <input type="submit" value="登录">
            </form>
        </fieldset>
    </body>
</html>
