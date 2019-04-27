<%@page language="java" pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="Content-Security-Policy" content="default-src *; style-src 'self' 'unsafe-inline'; script-src 'self' 'unsafe-inline' 'unsafe-eval'">
    <script src="http://www.google.com/recaptcha/api.js?onload=myCallBack&render=explicit" async defer></script>
    <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png"/>
    <link rel="icon" type="image/png" href="../assets/img/favicon.png"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>

    <title>犯人录入</title>

    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport'/>
    <meta name="viewport" content="width=device-width"/>
    <!-- Bootstrap core CSS     -->
    <link href="${APP_PATH}/assets/css/bootstrap.min.css" rel="stylesheet"/>

    <!--  Material Dashboard CSS    -->
    <link href="${APP_PATH}/assets/css/material-dashboard.css" rel="stylesheet"/>

    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="${APP_PATH}/assets/css/demo.css" rel="stylesheet"/>

    <!--     Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <!--  <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons' rel='stylesheet' type='text/css'/> -->

    <link href="../iconfont/material-icons.css" rel="stylesheet"/>
</head>

<body>

<div class="wrapper">
    <div class="sidebar" data-color="purple" data-image="${APP_PATH}/assets/img/sidebar-1.jpg">
        <!--
            Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

            Tip 2: you can also add an image using data-image tag
        -->

        <div class="logo">
            <a href="http://www.creative-tim.com" class="simple-text">
                菜单项
            </a>
        </div>

        <div class="sidebar-wrapper">
            <ul class="nav">
                <li class="active">
                    <a href="index.jsp">
                        <i class="material-icons">dashboard</i>
                        <p>监狱总览</p>
                    </a>
                </li>
                <li>
                    <a href="${APP_PATH}/admin/dispatchLoginPage">
                        <i class="material-icons">person</i>
                        <p>录入系统</p>
                    </a>
                </li>
                <li>
                    <a href="${APP_PATH}/prisioner/list">
                        <i class="material-icons">content_paste</i>
                        <p>犯人列表</p>
                    </a>
                </li>
                <li>
                    <a href="typography.html">
                        <i class="material-icons">library_books</i>
                        <p>Typography</p>
                    </a>
                </li>
                <li>
                    <a href="icons.html">
                        <i class="material-icons">bubble_chart</i>
                        <p>Icons</p>
                    </a>
                </li>
                <li>
                    <a href="maps.html">
                        <i class="material-icons">location_on</i>
                        <p>Maps</p>
                    </a>
                </li>
                <li>
                    <a href="notifications.html">
                        <i class="material-icons text-gray">notifications</i>
                        <p>Notifications</p>
                    </a>
                </li>
                <li class="active-pro">
                    <a href="upgrade.html">
                        <i class="material-icons">unarchive</i>
                        <p>Upgrade to PRO</p>
                    </a>
                </li>
            </ul>
        </div>
    </div>

    <div class="main-panel">
        <nav class="navbar navbar-transparent navbar-absolute">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">犯人录入</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#pablo" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="material-icons">dashboard</i>
                                <p class="hidden-lg hidden-md">Dashboard</p>
                            </a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="material-icons">notifications</i>
                                <span class="notification">5</span>
                                <p class="hidden-lg hidden-md">Notifications</p>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Mike John responded to your email</a></li>
                                <li><a href="#">You have 5 new tasks</a></li>
                                <li><a href="#">You're now friend with Andrew</a></li>
                                <li><a href="#">Another Notification</a></li>
                                <li><a href="#">Another One</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#pablo" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="material-icons">person</i>
                                <p class="hidden-lg hidden-md">Profile</p>
                            </a>
                        </li>
                    </ul>

                    <form class="navbar-form navbar-right" id="form_quick_query" role="search">
                        <div class="form-group  is-empty">
                            <input type="text" id="prisionName" class="form-control" placeholder="快捷查询">
                            <span class="material-input"></span>
                        </div>
                        <button type="submit" id="search_prisioner" class="btn btn-white btn-round btn-just-icon">
                            <i class="material-icons">search</i>
                            <div class="ripple-container"></div>
                        </button>
                    </form>
                </div>
            </div>
        </nav>

        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-8">
                        <div class="card">
                            <div class="card-header" data-background-color="purple">
                                <h4 class="title">犯人信息录入</h4>
                                <p class="category">-----</p>
                            </div>
                            <div class="card-content">
                                <form>
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group label-floating">
                                                <label class="control-label">姓名</label>
                                                <input name="prision_name" type="text" class="form-control">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group label-floating">
                                                <label class="control-label">籍贯</label>
                                                <input name="prision_home" type="text" class="form-control">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group label-floating">
                                                <label class="control-label">亲属电话</label>
                                                <input name="" type="text" class="form-control">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group label-floating">
                                                <label class="control-label">入狱时间</label>
                                                <input name="prision_enter_date" id="enter_date" type="text"
                                                       class="form-control">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group label-floating">
                                                <label class="control-label">出狱时间</label>
                                                <input name="prision_finsh_date" type="date" class="form-control">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group label-floating">
                                                <label class="control-label">身份证号码</label>
                                                <input type="prision_card" class="form-control">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-3">
                                            <div class="form-group label-floating">
                                                <label class="control-label">危险等级</label>
                                                <select name="prision_danger_level_id" class="form-control">
                                                    <c:forEach items="${AllDangerLevel}" var="danger">
                                                        <option value="${danger.dangerLevelId}">${danger.dangerLevelName}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group label-floating">
                                                <label class="control-label">指派狱警</label>
                                                <select name="prision_police_id" class="form-control">
                                                    <c:forEach items="${AllprisionerPolice}" var="police">
                                                        <option value="${police.policeId}">${police.policeName}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group label-floating">
                                                <label class="control-label">指定关押区域</label>
                                                <select name="prision_prisioner_area" class="form-control">
                                                    <option value="">东A区</option>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="col-md-3">
                                            <div class="form-group label-floating">
                                                <label class="control-label">指定关押房间号</label>
                                                <select name="prision_prisioner_roomid" class="form-control">
                                                    <option value="">210</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label>About Me</label>
                                                <div class="form-group label-floating">
                                                    <label class="control-label"> Lamborghini Mercy, Your chick she so
                                                        thirsty, I'm in that two seat Lambo.</label>
                                                    <textarea class="form-control" rows="5"></textarea>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <button type="submit" class="btn btn-primary pull-right">Update Profile</button>
                                    <div class="clearfix"></div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card card-profile">
                            <div class="card-avatar">
                                <a href="#pablo">
                                    <img class="img" src="${APP_PATH}/assets/img/faces/marc.jpg"/>
                                </a>
                            </div>

                            <div class="content">
                                <h6 class="category text-gray">CEO / Co-Founder</h6>
                                <h4 class="card-title">Alec Thompson</h4>
                                <p class="card-content">
                                    Don't be scared of the truth because we need to restart the human foundation in
                                    truth And I love you like Kanye loves Kanye I love Rick Owens’ bed design but the
                                    back is...
                                </p>
                                <a href="#pablo" class="btn btn-primary btn-round">Follow</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <footer class="footer">
            <div class="container-fluid">
                <nav class="pull-left">
                    <ul>
                        <li>
                            <a href="#">
                                Home
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                Company
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                Portfolio
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                Blog
                            </a>
                        </li>
                    </ul>
                </nav>
                <p class="copyright pull-right">
                    &copy;
                    <script>document.write(new Date().getFullYear())</script>
                    <a href="http://www.creative-tim.com">Creative Tim</a>, made with love for a better web
                </p>
            </div>
        </footer>
    </div>
</div>

</body>

<!--   Core JS Files   -->
<script src="../assets/js/jquery-3.1.0.min.js" type="text/javascript"></script>
<script src="../assets/js/bootstrap.min.js" type="text/javascript"></script>
<script src="../assets/js/material.min.js" type="text/javascript"></script>

<!--  Charts Plugin -->
<script src="../assets/js/chartist.min.js"></script>

<!--  Notifications Plugin    -->
<script src="../assets/js/bootstrap-notify.js"></script>

<!--  Google Maps Plugin    -->
<!-- <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js"></script> -->

<!-- Material Dashboard javascript methods -->
<script src="../assets/js/material-dashboard.js"></script>

<!-- Material Dashboard DEMO methods, don't include it in your project! -->
<script src="../assets/js/demo.js"></script>


<script>
    $(function () {
        var enter_date = 0;

        // 入狱时间 自动获取
        $("#enter_date").focus(function () {
            /*console.log(this);*/
            if(enter_date==0) {
                $("#enter_date").attr("value", getCurrentDate()).append(getCurrentDate());  // 属性添加+内容添加
                enter_date = 1;
            }

        })

        // 快捷查询
        $("#form_quick_query").submit(function () {
            if($("#prisionName").val().trim()!=""){
                quickQuery();
            }
            return false; // 阻止表单提交
        })


        // 快捷查询
        function quickQuery () {
            $.ajax({
                url:"${APP_PATH}/admin/quickQuery",
                data:{name:$("#prisionName").val()},
                type:"GET",
                success:function (data) { //data 接受的是一个 list集合 键值为下标 ，
                    $("#card-content").empty(); //
                    //console.log($(data))
                    $.each(data,function (index,value) {



                    })

                   // console.log("服务器正常返回"+data[0].prisionName);
                },
                error:function (e) {
                    console.log("服务器异常"+e)
                },
                dataType:"json"
            })
        }

        // 获取当前时间
        function getCurrentDate() {
            var myDate = new Date();
            //获取当前年
            var year = myDate.getFullYear();
            //获取当前月
            var month = myDate.getMonth() + 1;
            //获取当前日
            var day = myDate.getDate();
            var currentDate = year+"-"+month+"-"+day;
            return currentDate;
        }

    })

</script>

</html>
