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
    <title>欢迎来到注册界面.</title>
    <style>
        .box{
            margin:0 auto;
            width:800px;
            height:100px;
        }
        .box1{
            margin:0 auto;
            width: 30%;
        }
        .box2{
            margin:0 auto;
            width: 60%;
        }
    </style>
</head>
<body>

    <form action="${pageContext.request.contextPath}/agent/checkRegister/" METHOD="post">
        <div class="box">
            <div>
                <tr>
                    <td class="box1">username:</td>
                    <td class="box2"><input id = "userName" name = "userName" type="text" value="" onblur="textkongzhi()"></td>
                </tr>
            </div>
            <div>
                <tr>
                    <td>password:</td>
                    <td><input id = "passWord" name = "passWord" type="password"></td>
                </tr>
            </div>
            <div>
                <tr>
                    <td>confirm password:</td>
                    <td><input id = "confirmpPassWord" name = "passWord" type="password"></td>
                </tr>
            </div>
            <div>
                <tr>
                    <td><input type = "submit" value="register"></td>
                </tr>
            </div>
        </div>
    </form>

    <script type="text/javascript">
        function validate(){
            var username=document.getElementById("userName").value;
            var password=document.getElementById("passWord").value;
            var password2=document.getElementById("confirmpPassWord").value;
            if(username == ""||username==null){
                window.alert("请输入用户名！");
                confirmNewPassword.focus();
                return false;
            }
            if(password == ""||password==null){
                window.alert("请输入密码！");
                confirmNewPassword.focus();
                return false;
            }
            if(password2 == ""||password2==null){
                window.alert("请再次输入密码！");
                confirmNewPassword.focus();
                return false;
            }
            if(password != password2){
                window.alert("两次输入的密码不一致！");
                confirmNewPassword.focus();
                return false;
            }
            return true;
        }
        function textkongzhi() {
            var username=document.getElementById("userName").value;
            var password=document.getElementById("passWord").value;
            var password2=document.getElementById("confirmpPassWord").value;
            if(username==""){
                
            }
        }
    </script>
</body>
</html>
