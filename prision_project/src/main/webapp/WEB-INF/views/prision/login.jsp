<%@page language="java" pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>登陆</title>
    <!-- Custom Theme files -->
    <link href="${APP_PATH}/assets/css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="${APP_PATH}/assets/css/animate.css" rel="stylesheet" type="text/css" media="all"/>
    <%--jquery __ plugin--%>
    <script src="${APP_PATH}/assets/js/jquery-3.1.0.min.js"></script>
    <script src="${APP_PATH}/assets/js/wow.min.js"></script>
    <!-- Custom Theme files -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords"
          content="Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
   <%-- <!--Google Fonts-->
    <link href='http://fonts.useso.com/css?family=Roboto:500,900italic,900,400italic,100,700italic,300,700,500italic,100italic,300italic,400'
          rel='stylesheet' type='text/css'>
    <link href='http://fonts.useso.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet'
          type='text/css'>
    <!--Google Fonts-->--%>
</head>
<body>
<div class="login">
    <h2>xx监狱</h2>
    <div class="login-top">
        <h1>录入_查询_系统</h1>
        <c:if test="${msg!=null}">
            <div style="color: red;" id="notice">
                <p class="warn-info animated shake">${msg}</p>
            </div>
        </c:if>

        <form action="${APP_PATH}/admin/login" method="post">
            <input type="text" id="username" name="prisionAdminName" placeholder="管理员用户名" >

            <input type="password" name="prisionAdminPwd" placeholder="管理员密码">
            <div class="forgot">
                <a href="#">xxx监狱</a>
                <input type="submit" value="登陆">
            </div>
        </form>
    </div>
    <div class="login-bottom">
        <h3>back &nbsp;<a href="#"></a>&nbsp </h3>
    </div>
</div>

<script>
    $(function () {
        new WOW().init();
        $("#username").focus(function () {
            console.log(this);
            $("#notice").html("");
        })
    })

</script>
<%--<div class="copyright">
    <p>Copyright &copy; 2015.Company name All rights reserved.<a target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a> - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></p>
</div>--%>


</body>
</html>