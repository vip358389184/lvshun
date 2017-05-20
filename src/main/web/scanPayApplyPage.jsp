<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="com.lvshun.config.PayConfig"%>
<html>

	
  <head>
    <title>扫码支付申请</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
  </head>
  <body>
<!--   <form name="MD5form" id="MD5form" method="post" action="/Pay%5FDemo/scanPay/pay"> -->
	  <form name="MD5form" id="MD5form" method="post" action="/scanPay/pay"> 
	    <table width="50%" border="1" cellpadding="1" cellspacing="0" bgColor="#E9F4F9" class="tb26" align="center">
	    	<tr height="35">
	        <td width="100%" colspan="3" align="center" class="tb28">
	          扫码支付申请参数
	        </td>
	      </tr>
	      <tr>
	        <td width="40%" height="25" bgcolor="#DDEEF8" class="tb27" align="left" valign="bottom">
	          服务版本号:
	        </td>
	        <td width="60%" class="tb29" valign="bottom">
	          <input name="versionId" class="intext" type="text" size="48" maxlength="50" value="1.0">*
	        </td>
	      </tr>
	      <tr>
	        <td height="25" bgcolor="#DDEEF8" class="tb27" align="left" valign="bottom">
	          订单金额:
	        </td>
	        <td class="tb29" valign="bottom">
	          <input name="orderAmount" class="intext" type="text" size="48" maxlength="13" value="1">*（以分为单位）
	        </td>
	      </tr>
	      <tr>
	        <td height="25" bgcolor="#DDEEF8" class="tb27" align="left" valign="bottom">
	          订单日期:
	        </td>
	        <td class="tb29" valign="bottom">
	          <input name="orderDate" id="orderDate" class="intext" type="text" size="48" maxlength="20" value="">*（yyyyMMddHHmmss）
	        </td>
	      </tr>


	      <tr>
	        <td height="25" bgcolor="#DDEEF8" class="tb27" align="left" valign="bottom">
	          加密方式:
	        </td>
	        <td class="tb29" valign="bottom">
	          <input name="signType" class="intext" type="text" size="48" maxlength="4" value="MD5">*
	        </td>
	      </tr>
	      <tr>
	        <td height="25" bgcolor="#DDEEF8" class="tb27" align="left" valign="bottom">
	             商户编号 :
	        </td>
	        <td class="tb29" valign="bottom">
	          <input name="merId" class="intext" type="text" size="48" maxlength="30" value="<%=PayConfig.merId%>">*
	        </td>
	      </tr>
	      <tr>
	        <td height="25" bgcolor="#DDEEF8" class="tb27" align="left" valign="bottom">
	             商品订单号 :
	        </td>
	        <td class="tb29" valign="bottom">
	          <input name="prdOrdNo" id="prdOrdNo" type="text" size="48"  maxlength="30" value="">*
	        </td>
	      </tr>
	      <tr>
	        <td height="25" bgcolor="#DDEEF8" class="tb27" align="left" valign="bottom">
	             支付方式 :
	        </td>
	        <td class="tb29" valign="bottom">
	          <select name="payMode" id="payMode" >*

                  <option value="00020" >银行卡</option>


               </select>
	        </td>
	      </tr>
	      <tr>
	        <td height="25" bgcolor="#DDEEF8" class="tb27" align="left" valign="bottom">
	             到账类型:
	        </td>
	        <td class="tb29" valign="bottom">
	          <select name="receivableType" id="receivableType" >*
                  <option value="D00" >D+0</option>
                  <option value="T01" >T+1</option>
               </select>
	        </td>
	      </tr>



	      <tr height="35">
	        <td width="100%" colspan="3" align="center" class="tb28">
	          <input type="submit" class="btn_2" value="&nbsp;提  交&nbsp;">
	          &nbsp;
	          <input type="reset" name="reset" class="btn_2"
	            value="&nbsp;返  回&nbsp;"
	            onClick="javascript:window.location='<%=request.getContextPath()%>/g.html'">
	        </td>
	      </tr>
	    </table>
	  </form>
  </body>
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


</html>
