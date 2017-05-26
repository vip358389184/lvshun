<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="com.lvshun.config.PayConfig"%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>绿顺支付</title>

    <script src="js/jquery-1.9.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/js/main.css">
    <link rel="stylesheet" type="text/css" href="/js/bankList.css">
    <!--[if lt IE 9]>
    <style>#no-ie{display:block;}</style>
    <![endif]-->
</head>
<body :controller="vmPayment">
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
            <div class="o-right">
                <div class="o-price"><em>应付金额</em><strong>0.00</strong><em>元</em></div>
                <div class="o-detail"><a onclick="" href="">订单详情<i></i></a></div>
            </div>
            <!-- 订单金额 end -->
            <div class="o-list j_orderList" id="listPayOrderInfo"><!-- 单笔订单 -->

                <!-- 多笔订单 end -->
            </div>
        </div>



        <form name="MD5form" id="MD5form" method="post" action="/scanPay/pay">
            <table width="50%"  class="tb26" align="center">
                <tr>
                    <td  hidden width="40%" height="25" class="tb27" align="left" valign="bottom">
                        服务版本号:
                    </td>
                    <td width="60%" class="tb29" valign="bottom">
                        <input  hidden name="versionId" class="intext" type="text" size="48" maxlength="50" value="1.0">
                    </td>
                </tr>
                <tr>
                    <td height="25"  class="tb27" align="left" valign="bottom">
                        应付金额:
                    </td>
                    <td class="tb29" valign="bottom">
                        <input name="orderAmount"  class="intext" type="text" size="48" maxlength="13" value="1">
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
                    <td height="25" class="tb27" align="left" valign="bottom">
                        支付方式 :
                    </td>
                    <td class="tb29" valign="bottom">
                        <input type="checkbox" value="00020" name="payMode" id="payMode">银行卡</td>
                       <%-- <select name="payMode" id="payMode" >
                    </td>
                            <option value="00020" >银行卡</option>
                        </select>--%>
                </tr>
                <tr>
                    <td height="25" hidden class="tb27" align="left" valign="bottom">
                        到账类型:
                    </td>
                    <td class="tb29"  hidden valign="bottom">
                        <select name="receivableType" id="receivableType" >
                            <option value="D00" >D+0</option>
                            <option value="T01" >T+1</option>
                        </select>
                    </td>
                </tr>
                <tr height="35">
                    <td width="100%" colspan="3" align="center" class="tb28">
                        <input type="submit" class="btn_2" value="&nbsp;立 即 支 付&nbsp;"style="background-color: red;color:white; width:150px;height: 40px;">
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
</script>

</body>

</html>