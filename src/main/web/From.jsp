<!DOCTYPE html>
<html>
<%@ page language="java" pageEncoding="UTF-8"%>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link  rel="stylesheet" href="css/formcss.css">
    <script src="js/form.js" type="text/javascript"></script>
    <link rel="shortcut icon" href="user/favicon.ico">
</head>
<%request.setAttribute("username",request.getParameter("username"));%>
<body ng-app="addform" ng-controller="addformCtrl">
<div class="erji">
    <p class="chuang">创建收货地址</p>
<form class="from" name="disabled" onSubmit="return add(this);">
    <div class="nn">
        <label>收件人名<span class="span">*</span></label>
        <input  class="ff" type="text" id="username" ng-model="username" id="username" onblur="username_num_message()" onkeyup="username_message()" />
        <span style="display: -webkit-inline-box;"><img src="img/formaddtishi.png" style="display: none;width: 17px; height: 21px" id="username_img"/><label id="username_message" style="color: red;font-size: 14px;"></label></span>

    </div>
    <div>
        <label>手机号码<span class="span">*</span></label>
        <input  class="ff" type="text" id="phone" ng-model="phone" name="phone" onblur="phone_num_message()" onkeyup="phone_message()" />
        <span style="display: -webkit-inline-box;"><img src="img/formaddtishi.png" style="display: none;width: 17px; height: 21px" id="phone_img"/><label id="phone_message" style="color: red;font-size: 14px;"></label></span>
    </div>
    <div>
        <label>邮政编码<span class="span">*</span></label>
        <input  class="ff" type="text" id="dawk" ng-model="dawk" name="dawk" onblur="dawk_num_message()" onkeyup="dawk_message()" />
        <span style="display: -webkit-inline-box;"><img src="img/formaddtishi.png" style="display: none;width: 17px; height: 21px" id="dawk_img"/><label id="dawk_message" style="color: red;font-size: 14px;"></label></span>
    </div>
    <div>
        <label>所在地区<span class="span">*</span></label>
        <input  class="ff" type="text"  id="prefecture" ng-model="prefecture" name="prefecture" onblur="prefecture_num_message()" onkeyup="prefecture_message()"/>
        <span style="display: -webkit-inline-box;"><img src="img/formaddtishi.png" style="display: none;width: 17px; height: 21px" id="prefecture_img"/><label id="prefecture_message" style="color: red;font-size: 14px;"></label></span>
    </div>
    <div>
        <label class="xi">详细地址<span class="span">*</span></label>
        <textarea class="ff" placeholder="请你填写详细地址" ng-model="address" id="address" name="address"  onblur="address_num_message()" onkeyup="address_message()"></textarea>
        <span style="display: -webkit-inline-box;"><img src="img/formaddtishi.png" style="display: none;width: 17px; height: 21px" id="address_img"/><label id="address_message" style="color: red;font-size: 14px;"></label></span>
    </div>
    <%--  <div >
    <label>收件人名<span class="span">*</span></label>
    <input   type="text"  ng-model="usernames" value="<%=request.getParameter("username")%>"  />
    </div>--%>

    <div>
        <input  class="btn" type="submit"  value="保存"   ng-click="addformm()"/>
    </div>
</form>


</div>
</body>
<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="js/angular/angular.min.js" type="text/javascript"></script>

<script type="text/javascript">
    var app = angular.module('addform', []);
    app.controller("addformCtrl",function ($scope,$http) {
        $scope.username="";
        $scope.phone="";
        $scope.dawk="";
        $scope.prefecture="";
        $scope.address="";
        $scope.addformm=function () {
            var username = $scope.username;
            var phone = $scope.phone;
            var dawk = $scope.dawk;
            var prefecture = $scope.prefecture;
            var address = $scope.address;
            var parme = {
                'username': username,
                "phone": phone,
                "dawk": dawk,
                "prefecture": prefecture,
                "address": address
            };
           /* if ($scope.ADDform.vbis()) {*/

                $http({
                    method: 'POST',
                    url: '/OrderList/addorderList',
                    data: parme,
                    dataType: 'json',
                }).success(function (data, status, headers, config) {

                    if (data == 'ERROR') {
                        alert("更新失败！");
                        window.location = "From.jsp";

                    } else {

                        alert("更新成功！");
                        window.close();
                    }
                }).error(function (data, status, headers, config) {
                    alert("更新失败！");
                })
            }



    });






</script>
</html>