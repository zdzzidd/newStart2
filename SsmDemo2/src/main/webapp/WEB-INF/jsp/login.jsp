<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\4\9 0009
  Time: 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎来到登录界面.</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/agent/checkLogin/" METHOD="post">
            <tr>
                <td>username:</td>
                <td><input id = "username" name = "username" type="text"></td>
            </tr>
            <tr>
                <td>password:</td>
                <td><input id = "password" name = "password" type="password"></td>
            </tr>
        <tr>
                <td><input type = "submit" value="login"></td>
                <td><input type = "button"disabled="disabled" value="我是帅哥"></td>
        </tr>
    </form>
</body>
</html>
