﻿<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="com.lvshun.config.PayConfig"%>
<%
request.setAttribute("money",request.getParameter("money"));%>
<%request.setAttribute("c_name",request.getParameter("c_name"));%>
<%request.setAttribute("picture",request.getParameter("picture"));%>
<%request.setAttribute("label",request.getParameter("label"));%>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html"; charset="gbk" />
    <meta name="renderer" content="webkit">
    <title>绿顺支付</title>
    <link rel="shortcut icon" href="user/favicon.ico">
    <script src="js/jquery-1.9.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/js/main.css">
    <link rel="stylesheet" type="text/css" href="/js/bankList.css">
    <link rel="stylesheet" type="text/css" href="/css/pay.css">
    <script src="/js/angular/angular.min.js" type="text/javascript"></script>
    <!--[if lt IE 9]>
    <style>#no-ie{display:block;}</style>
    <![endif]-->



    <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="js/open.js"></script>
</head>
<script type="text/javascript">
    function check(fileName,alertText){
        with(fileName){
            if(value==null || value==""){
                alert(alertText);
                return false;
            }else{
                return true;
            }
        }
    }
    function checks(thisForm){
        with(thisForm){
            if(check(postUrl,"请输入请求地址")==false){
                postUrl.focus();
                return false;
            }
            if(check(svcName,"请输入服务名称")==false){
                svcName.focus();
                return false;
            }
            if(check(key,"请输入MD5密钥")==false){
                key.focus();
                return false;
            }
            if(check(merId,"请输入商户编号")==false){
                merId.focus();
                return false;
            }
            if(check(amt,"请输入订单金额")==false){
                amt.focus();
                return false;
            }
            if(check(merUrl,"请输入返回商户URL")==false){
                merUrl.focus();
                return false;
            }
            if(check(retUrl,"请输入结果通知URL")==false){
                retUrl.focus();
                return false;
            }
            if(check(tranChannel,"请选择交易渠道")==false){
                tranChannel.focus();
                return false;
            }
        }
        return true;
    }
</script>

<body ng-app="myApp" ng-controller="OrderListController">

<!-- shortcut -->
<div class="shortcut">
    <div class="w">
        <div class="s-logo">
            <img width="150" height="28" alt=" 收银台" src="img/log.png">
        </div>
        <ul class="s-right">
            <li id="loginbar" class="s-item fore1"></li>
            <li class="s-div">|</li>
            <li class="s-item fore2">
                <a class="op-i-ext" href="" >我的订单</a>
            </li>
            <li class="s-div">|</li>
            <li class="s-item fore3">
                <a class="op-i-ext" target="_blank" href="" >支付帮助</a>
            </li>
        </ul>
        <span class="clr"></span>
    </div>
</div>
<div class="main">
    <div class="w">
        <div class="order clearfix">

            <!-- 订单信息 -->
            <div class="o-left"><h3 class="o-title">订单提交成功，请尽快付款！</h3>

                <p class="o-tips" id="deleteOrderTip">
                </p>
            </div>
            <!-- 订单信息 end --><!-- 订单金额 -->
            <div class="o-list j_orderList" id="listPayOrderInfo"><!-- 单笔订单 -->
            </div>
        </div>
        <div class="top">
            <form method="post">
            <p class="imgas"><img  src="<%=request.getParameter("picture")%>"/></p>

            <p class="name" ng-model="c_name"><%=request.getParameter("c_name")%><%=request.getParameter("label")%></p>
                <input type="text"  ng-model="o_name">
            <p class="moen" ng-model="money"><span class="sp" style="font-size: 12px;">￥</span><%=request.getParameter("money")%></p>
                <input type="button" ng-click="shop()" value="加入购物车">
            </form>
        </div>
        <form name="MD5form" class="ying" id="MD5form" method="post" action="/payApply/pay">
            <table width="50%"  class="tb26" align="center">
                <tr>
                    <td  hidden width="40%" height="25" class="tb27" align="left" valign="bottom">
                        服务版本号:
                    </td>
                    <td width="60%" class="tb29" valign="bottom">
                        <input  hidden name="versionId" class="intext" type="text" size="48" maxlength="50" value="1.0">
                    </td>
                </tr>
                <tr >
                    <p cl   hidden class="tb27" align="left" valign="bottom">
                        应付金额:
                    </p>

                    <td class="tb29" valign="bottom">
                        <%--<input name="orderAmount" class="intext" type="text" size="48" maxlength="13" value="<%=request.getParameter("money")%>">--%>
                            <input name="orderAmount"  hidden class="intext"  type="text" size="48" maxlength="13" value="<%=request.getParameter("money")%>00">

                           <%-- 应付金额：<%=request.getParameter("money")%>00分--%>
                    </td>
                </tr>
                <tr>
                    <td height="25" hidden class="tb27" align="left" valign="bottom">
                        订单日期:
                    </td>

                    <td class="tb29" valign="bottom">
                        <input name="orderDate" hidden id="orderDate" class="intext" type="text" size="48" maxlength="20" value="">
                    </td>
                </tr>


                <tr>
                    <td height="25"  class="tb27" hidden align="left" valign="bottom">
                        加密方式:
                    </td>
                    <td class="tb29" valign="bottom">
                        <input name="signType" class="intext" type="text" size="48" maxlength="4" hidden  value="MD5">
                    </td>
                </tr>
                <tr>
                    <td height="25" hidden class="tb27"   align="left" valign="bottom">
                        商户编号 :
                    </td>
                    <td class="tb29" valign="bottom">
                        <input name="merId" class="intext" hidden type="text" size="48" maxlength="30" value="<%=PayConfig.merId%>">
                    </td>
                </tr>
                <tr>
                    <td height="25" class="tb27"  hidden align="left" valign="bottom">
                        商品订单号 :
                    </td>

                    <td class="tb29" valign="bottom">
                        <input name="prdOrdNo" hidden id="prdOrdNo" type="text" size="48"  maxlength="30" value="">
                    </td>
                </tr>
                <tr>
                    <td  hidden height="25" class="tb27" align="left" valign="bottom">
                        支付方式 :
                    </td>
                    <td class="tb29" valign="bottom">
                        <input hidden name="payMode" id="payMode" type="text" size="48"  maxlength="30" value="00020">

                    </td>


                       <%-- <select name="payMode" id="payMode" >
                    </td>
                            <option value="00020" >银行卡</option>
                        </select>--%>
                </tr>
                <tr>
                <td height="25"  hidden class="tb27" align="left" valign="bottom">
                    支付通道码 :
                </td>
                <td class="tb29" valign="bottom">
                    <input hidden name="typecode" id="typecode" type="text" size="48"  maxlength="30" value="${typecode}">
                </td>
                </tr>
                <tr>
                    <td height="25" hidden class="tb27" align="left" valign="bottom">
                        到账类型:
                    </td>
                    <td class="tb29" valign="bottom">
                        <input hidden name="receivableType" id="receivableType" type="text" size="48"  maxlength="30" value="D00">
                    </td>
                </tr>
                <tr>
                    <td height="25" hidden  class="tb27" align="left" valign="bottom">
                        商品单价:
                    </td>
                    <td class="tb29" valign="bottom">
                        <input name="prdAmt" class="intext" type="text" size="48"  maxlength="13" value="<%=request.getParameter("money")%>" hidden>
                    </td>
                </tr>
                <tr>
                    <td height="25"  hidden class="tb27" align="left" valign="bottom">
                        商品展示网址:
                    </td>
                    <td class="tb29" valign="bottom">
	          <textarea hidden name="prdDisUrl" class="intext" rows="2" cols="50" onpropertychange="checkLength(this,120);"
                        oninput="checkLength(this,120);">http://www.icardpay.com</textarea>
                    </td>
                </tr>
                <tr>
                    <td height="25" hidden  class="tb27" align="left" valign="bottom">
                        商品名称:
                    </td>
                    <td class="tb29" valign="bottom">
                        <input  hidden  name="prdName" class="intext" type="text" size="48" maxlength="48" value="<%=request.getParameter("c_name")%>">
                    </td>
                </tr>
                <tr>
                    <td height="25" hidden  class="tb27" align="left" valign="bottom">
                        商品简称:
                    </td>
                    <td class="tb29" valign="bottom">
                        <input hidden name="prdShortName" class="intext" type="text" size="48" maxlength="48"  value="">
                    </td>
                </tr>
                <tr>
                    <td height="25" hidden  class="tb27" align="left" valign="bottom">
                        商品描述:
                    </td>
                    <td class="tb29" valign="bottom">
	          <textarea hidden name="prdDesc" class="intext" rows="2" cols="50" onpropertychange="checkLength(this,500);"
                        oninput="checkLength(this,500);"></textarea>
                    </td>
                </tr>
                <tr>
                    <td height="25" hidden  class="tb27" align="left" valign="bottom">
                        扩展参数:
                    </td>
                    <td class="tb29" valign="bottom">
                        <input hidden name="merParam" class="intext" type="text" size="48" maxlength="500" value="">
                    </td>
                </tr>

                <tr>
                    <div class="o-right" align="center">

                        <div class="o-price"><em style="font-size: 18px">应付金额:&nbsp;&nbsp;&nbsp;&nbsp;</em><strong style="color: red;font-size: 18px"><%=request.getParameter("money")%></strong><em>元</em></div>
                    </div>
                    <div   id="col" onclick="openwin();" style="width:120px;font-size: 18px">
                        新增收货地址
                    </div>
                    <td  colspan="3"  width="50%" align="center" class="tb28">
                        <input type="submit" id="next" name="next" class="btn_2" value="&nbsp;下 一 步 &nbsp;"style="background-color: red;color:white; width:120px;height: 30px;font-size: 18px">
                    </td>
</tr>
            </table>
        </form>
    </div>
</div>
<script type="text/javascript">
    function getNewID() {
        var Num="";
        for(var i=0;i<14;i++){
            Num+=Math.floor(Math.random()*10);
        }
        document.getElementById("prdOrdNo").value=Num;
        var dateStr = getNowFormatDate();
        document.getElementById("orderDate").value=dateStr;
    }
    getNewID();

    function getNowFormatDate() {
        var date = new Date();
        var seperator1 = "";
        var seperator2 = "";
        var month = date.getMonth() + 1;
        var strDate = date.getDate();
        if (month >= 1 && month <= 9) {
            month = "0" + month;
        }
        if (strDate >= 0 && strDate <= 9) {
            strDate = "0" + strDate;
        }
        var hours = date.getHours();
        var mins = date.getMinutes();
        var secs = date.getSeconds();
        var msecs = date.getMilliseconds();
        if(hours<10) hours = "0"+hours;
        if(mins<10) mins = "0"+mins;
        if(secs<10) secs = "0"+secs;
        var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
            + hours+ seperator2 + mins
            + seperator2 + secs;
        return currentdate;
    }
    var app = angular.module('myApp', []);
    app.controller("OrderListController",function ($scope,$http) {
        //$scope.picture="";
      //  $scope.money="";
        $scope.o_name="";

        $scope.shop=function () {
            //var picture=$scope.picture;
          //  var money=$scope.money;
            var o_name=$scope.o_name;

            var parme ={
                //'picture':picture,
               // "money":money,
                "o_name":o_name
            };


                $http({
                    method:'POST',
                    url:'/OrderList/addorderList',
                    data:parme,
//                  dataType:'json',
                }).success(function (data,status, headers, config) {
                    if(data=='ERROR'){
                        //alert("注册失败！")
                    }else {
                      alert("注册成功！")
                        //window.location = "login.html";
                    }
                }).error(function (data,status,headers,config) {

                    //alert("注册失败！");
                })

        }

    });

</script>

</body>

</html>