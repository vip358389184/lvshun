<!DOCTYPE html>
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
		<meta charset="utf-8" />
		<title></title>
		<meta name="keywords" content="">
		<meta name="description" content="">
		<link rel="stylesheet" href="css/common.css">
		<link rel="stylesheet" href="css/animate.min.css">
		<link rel="stylesheet" href="css/location.css">
		<link rel="stylesheet" href="css/item.css">
		<link rel="stylesheet" href="css/layer.css" id="layui_layer_skinlayercss">
		<script type="text/javascript" src="js/open.js"></script>
	</head>
	<style type="text/css">
		.wenzi{
			margin-left: 40px;
		}

		.cart-buy{

			margin-top: 20px;
		}



	</style>
	<body      ng-app="Selectform" ng-controller="SelectformCtrl">


	<div class="navtitleright nb">
		<a href="#">欢迎光临</a> &gt;

		</div>
		<div class="indbody pro-style">
			<div class="nb recom-box">
				<div class="pro-view" id="ym-item">
					<div class="pview-left">
						<div class="ovclear">
							<div class="slide-fish">
								<div class="t2">
									<a href="<%=request.getParameter("picture")%>" id="bigimg" class="MagicZoom MagicThumb" style="position: relative; display: block; outline: 0px; text-decoration: none; width: 410px;"><img src="<%=request.getParameter("picture")%>" id="sim145606" class="main_img" style="width:410px;height: 410px;">
										<div id="bc145606" class="MagicZoomBigImageCont" style="width: 300px; height: 300px; left: -10000px; top: 0px; overflow: hidden; z-index: 100; visibility: hidden; position: absolute; display: block;">
											<div style="overflow: hidden;"><img src="<%=request.getParameter("picture")%>" style="position: relative; left: -499.512px; top: -499.512px; display: block; visibility: visible;"></div>
										</div>
										<div class="MagicZoomPup" style="z-index: 10; visibility: hidden; position: absolute; opacity: 0.5; width: 153.75px; height: 153.75px; left: 256.25px; top: 256.25px;"></div>
									</a>
								</div>
								<div class="small-scroll">
									<a class="prev" href="javascript:void(0);"></a>
									<a class="next" href="javascript:void(0);"></a>
									<div class="bd">
										<ul class="smallImg" id="imglist">
											<li class="on">
												<a rel="bigimg" rev="<%=request.getParameter("picture")%>"><img src="<%=request.getParameter("picture")%>"></a>
											</li>
										</ul>
									</div>
								</div>
							</div>
							<div class="fish-detail">
								<h3><%=request.getParameter("c_name")%><%=request.getParameter("label")%></h3>
								<p></p>
								<div class="price">
									<div>市场价：<s>￥6099.00</s></div>
									<div>价格：<span class="redbold">￥<b id="ym-price"><%=request.getParameter("money")%></b></span></div>
								</div>

							<div class="spec" id="goods-spec">
								<div class="it">
									<span class="spec-name">内存</span>：<span class="select-mod"><a href="javascript:void(0);" id="16g">16g<i class="icon-check-zf"></i></a>	<a href="javascript:void(0);" id="32g">32g<i class="icon-check-zf"></i></a>	<a href="javascript:void(0);" id="64g">64g<i class="icon-check-zf"></i></a>	</span>
								</div>
								<div class="it">
									<span class="spec-name">尺寸</span>：<span class="select-mod"><a href="javascript:void(0);" id="4寸">14寸<i class="icon-check-zf"></i></a>	<a href="javascript:void(0);" id="5寸">15寸<i class="icon-check-zf"></i></a>	<a href="javascript:void(0);" id="6寸">16寸<i class="icon-check-zf"></i></a>	</span>
								</div>
								<div class="it">
									<span class="spec-name">颜色</span>：<span class="select-mod"><a href="javascript:void(0);" id="白色">白色<i class="icon-check-zf"></i></a>	<a href="javascript:void(0);" id="黑色">黑色<i class="icon-check-zf"></i></a>	</span>
								</div>
							</div>
						<div class="pro-number"  ng-repeat="(x, value) in myObj">

						<%--	<input type="radio">{{value.username}}</p>
									<p><input type="radio">{{value.address}}</p>--%>

							<input type="radio"   ><span hidden >{{value.username}}</span>{{value.address}}



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
											<div class="o-right" align="center" hidden>

												<div class="o-price" hidden><em style="font-size: 18px">应付金额:&nbsp;&nbsp;&nbsp;&nbsp;</em><strong style="color: red;font-size: 18px"><%=request.getParameter("money")%></strong><em>元</em></div>
											</div>
											<div class="cart-buy">


												<input type="submit" value="立即购买" style="background-color:#007cc3;color:#fff;width:198px;height:48px;font-size: 16px;border:2px solid #007cc3; " />

												<a   onclick="openwin();" class="cart-btn">新增收货地址</a>
												<%--<a href="pay.jsp"  onclick="addCart(115,1,&#39;&#39;, 0);" class="buy-btn">立即购买</a>--%>

											</div>

										</tr>
									</table>
								</form>


						</div>
					</div>
				</div>
			<div class="pview-right">
                    <div class="hd">
                        <a href="javascript:void(0);" class="prev"></a>
                        <a href="javascript:void(0);" class="next"></a>
                    </div>
                </div>
            </div>
			</div>

			<div class="wenzi">
							<div class="evalute">
								<h3 class="title">商品评价</h3>
								<div class="percentgood">
									<div class="pgbox">
										<dl class="total">
											<dt>0%</dt>
											<dd>好评度</dd>
										</dl>
									</div>
									<div class="pgbox">
										<dl>
											<dt>好评（0%）</dt>
											<dd class="percentjd"><i class="" style="width:0%;"></i></dd>
										</dl>
									</div>
									<div class="pgbox">
										<dl>
											<dt>中评（0%）</dt>
											<dd class="percentjd"><i class="" style="width:0%"></i></dd>
										</dl>
									</div>
									<div class="pgbox">
										<dl>
											<dt>差评（0%）</dt>
											<dd class="percentjd"><i class="" style="width:0%;"></i></dd>
										</dl>
									</div>

								</div>

								<div class="tab-gbw">
									<div class="hd">
										<ul class="evalute-titleul">
											<li class="check on" data-level="" data-page="1">
												<a href="javascript:void(0);">全部评价<em class="embold">(0)</em></a>
											</li>
											<li data-level="good" data-page="0">
												<a href="javascript:void(0);">好评<em>(0)</em></a>
											</li>
											<li data-level="mid" data-page="0">
												<a href="javascript:void(0);">中评<em>(0)</em></a>
											</li>
											<li data-level="bad" data-page="0">
												<a href="javascript:void(0);">差评<em>(0)</em></a>
											</li>
										</ul>
									</div>
									<div class="bd">
										<div class="evalute-detail" id="all">
											<ul>
												<li style="text-align: center;">暂无评价~</li>
											</ul>
											<div class="loading" style="height: 100px;display: none; line-height: 100px; text-align: center; margin-top: 50px;"><span style="margin-left: 342px;">正在加载中，请稍候...</span></div>
										</div>
										<div class="evalute-detail" id="good" style="display: none;">
											<ul></ul>
											<div class="loading" style="height: 100px;line-height: 100px; text-align: center; margin-top: 50px;"><span style="margin-left: 342px;">正在加载中，请稍候...</span></div>
											<div class="pages" style="text-align: center;">
												<a class="loadmore">加载更多</a>
											</div>
										</div>
										<div class="evalute-detail" id="mid" style="display: none;">
											<ul></ul>
											<div class="loading" style="height: 100px;line-height: 100px; text-align: center; margin-top: 50px;"><span style="margin-left: 342px;">正在加载中，请稍候...</span></div>
											<div class="pages" style="text-align: center;">
												<a class="loadmore">加载更多</a>
											</div>
										</div>
										<div class="evalute-detail" id="bad" style="display: none;">
											<ul></ul>
											<div class="loading" style="height: 100px;line-height: 100px; text-align: center; margin-top: 50px;"><span style="margin-left: 342px;">正在加载中，请稍候...</span></div>
											<div class="pages" style="text-align: center;">
												<a class="loadmore">加载更多</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<h3 class="title">售后保障</h3>
							<div class="otherbox">
								<ul class=" list-paddingleft-2" style="width: 1459.1875px; white-space: normal;">
									<li>
										<p><span class="goods" style="margin: 0px; padding: 0px 10px 0px 0px; display: inline-block; width: 32px; height: 32px; vertical-align: bottom; background-image: url(https://static.360buyimg.com/item/default/1.0.29/components/detail/i/iconZP.png); background-attachment: initial; background-size: initial; background-origin: initial; background-clip: initial; background-position: initial; background-repeat: no-repeat;"></span>&nbsp;<strong style="margin: 0px; padding: 8px 0px 3px; display: inline-block;">厂家服务</strong></p>
									</li>
									<li>
										<p>本产品全国联保，享受三包服务，质保期为：一年质保（已激活的iPhone无质量问题不支持7天无理由退换货）<br>如因质量问题或故障，凭厂商维修中心或特约维修点的质量检测证明，享受7日内退货，15日内换货，15日以上在质保期内享受免费保修等三包服务！<br>(注:如厂家在商品介绍中有售后保障的说明,则此商品按照厂家说明执行售后保障服务。) 您可以查询本品牌在各地售后服务中心的联系方式，

									</li>
									<li>
										<p><strong style="margin: 0px; padding: 8px 0px 3px; display: inline-block;">承诺</strong></p>
									</li>
									<li>
										<p>平台卖家销售并发货的商品，由平台卖家提供发票和相应的售后服务。请您放心购买！<br>注：因厂家会在没有任何提前通知的情况下更改产品包装、产地或者一些附件，本司不能确保客户收到的货物与商城图片、产地、附件说明完全一致。只能确保为原厂正货！并且保证与当时市场上同样主流新品一致。若本商城没有及时更新，请大家谅解！</p>
									</li>
									<li>
										<p><span class="goods" style="margin: 0px; padding: 0px 10px 0px 0px; display: inline-block; width: 32px; height: 32px; vertical-align: bottom; background-image: url(https://static.360buyimg.com/item/default/1.0.29/components/detail/i/iconZP.png); background-attachment: initial; background-size: initial; background-origin: initial; background-clip: initial; background-position: initial; background-repeat: no-repeat;"></span><strong style="margin: 0px; padding: 8px 0px 3px; display: inline-block;">正品行货</strong></p>
									</li>
									<li>
										<p>商城向您保证所售商品均为正品行货，京东自营商品开具机打发票或电子发票。</p>
									</li>
									<li>
										<p><span class="unprofor" style="margin: 0px; padding: 0px 10px 0px 0px; display: inline-block; width: 32px; height: 32px; vertical-align: bottom; background-image: url(https://static.360buyimg.com/item/default/1.0.29/components/detail/i/iconLB.png); background-attachment: initial; background-size: initial; background-origin: initial; background-clip: initial; background-position: initial; background-repeat: no-repeat;"></span><strong style="margin: 0px; padding: 8px 0px 3px; display: inline-block;">全国联保</strong></p>
									</li>
									<li>
										<p>凭质保证书及商城发票，可享受全国联保服务（奢侈品、钟表除外；奢侈品、钟表由京东联系保修，享受法定三包售后服务），与您亲临商场选购的商品享受相同的质量保证。商城还为您提供具有竞争力的商品价格和
											<a href="#" target="_blank" style="margin: 0px; padding: 0px; color: rgb(0, 90, 160); text-decoration: none;">运费政策</a>，请您放心购买！&nbsp;<br><br>注：因厂家会在没有任何提前通知的情况下更改产品包装、产地或者一些附件，本司不能确保客户收到的货物与商城图片、产地、附件说明完全一致。只能确保为原厂正货！并且保证与当时市场上同样主流新品一致。若本商城没有及时更新，请大家谅解！</p>
									</li>
									<li>
										<p><br></p>
									</li>
								</ul>
								<p><br></p>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
		</div>
		<input type="hidden" id="goods_id" value="115">
		<input type="hidden" id="user_discount" value="">
		<div class="footer">
			<div class="nb">
				<div class="promise">
					<ul>
						<li>
							<div class="promise-box"><em class="yec-icon-qg yec-icon"></em>
								<div class="word">
									<h3>正品保障</h3>
									<p>正品行货 放心选购</p>
								</div>
							</div>
						</li>
						<li>
							<div class="promise-box"><em class="yec-icon-fare yec-icon"></em>
								<div class="word">
									<h3>满99包邮</h3>
									<p>满99 免运费</p>
								</div>
							</div>
						</li>
						<li>
							<div class="promise-box"><em class="yec-icon-cs yec-icon"></em>
								<div class="word">
									<h3>售后无忧</h3>
									<p>7天无理由退货</p>
								</div>
							</div>
						</li>
						<li>
							<div class="promise-box"><em class="yec-icon-help yec-icon"></em>
								<div class="word">
									<h3>帮助中心</h3>
									<p>您的购物指南</p>
								</div>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>


		<link rel="stylesheet" href="css/MagicZoom.css">
		<script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
		<script src="js/MagicZoom.js" type="text/javascript"></script>

		<script src="js/main.js" type="text/javascript"></script>
		<script src="js/layer.min.js"></script>
	</body>

	<script src="/js/angular/angular.min.js" type="text/javascript"></script>

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


        var app = angular.module('Selectform', []);
        app.controller('SelectformCtrl', function($scope,$http) {

            $http({
                method: 'POST',
                url: '/OrderList/getAllorder'
            }).then(function successCallback(response) {
                angular.forEach(response.data, function (data, index, array) {
                    $scope.myObj = response.data;
                });
            }, function errorCallback(response) {

            });

        });

	</script>
</html>