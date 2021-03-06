﻿<!DOCTYPE html>
<html>
<%@ page language="java" pageEncoding="UTF-8"%>
<head lang="en">
    <meta charset="UTF-8">
    <title>绿顺</title>
    <link rel="stylesheet" href="css/xiaomi.css"/>
    <script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
    <script src="js/jquery.animate-colors-min.js"></script>
    <link rel="shortcut icon" href="user/favicon.ico">
    <%request.setAttribute("username",request.getParameter("username"));%>
<style type="text/css">
    .banner_menu_content ul li a img{

        width: 50px;
        height: 50px;
    }

    .floor_goods_wrap_li img{
        width: 130px;
        height: 130px;
    }


    .floor_goods_fu img{
        width:200px;
        height:200px;
    }

</style>
</head>
<body ng-app="myApp" ng-controller="CommodityController" >
<div class="head_box">
    <div id="head_wrap">
        <div id="head_nav">
            <a class="head_nav_a">欢迎光临本店</a>
            <span>|</span>
            <a >收藏本站</a>

        </div>
        <div id="head_right">
            <div id="head_landing">
                <a class="head_nav_a" id="b" onload="b()" ><%=request.getParameter("username")%></a>
                <span>|</span>
                <a class="head_nav_a" href="login.html">登录</a>
                <span>|</span>
                <a class="head_nav_a" href="register.html">注册</a>
            </div>
          <!--  <div id="head_car">
                <a href="g.html" class="head_car_text">购物车（0）</a>
                <div id="car_content" style="height: 0px;width:0px ;background-color: #edffc6;z-index: 999">
                    <a class="car_text"></a>
                </div>
            </div>-->
        </div>
    </div>
</div>
<div id="main_head_box">
    <div id="menu_wrap">
        <div id="menu_logo">
            <img src="img/log.png">
        </div>
        <div id="menu_nav">
            <ul>
                <li class="menu_li" control="xiaomiphone">热卖</li>
                <li class="menu_li" control="hongmiphone">手机</li>
                <li class="menu_li" control="pingban">手表</li>
                <li class="menu_li" control="tv">电视</li>
                <li class="menu_li" control="luyou">美妆</li>
                <li class="menu_li" control="yingjian">智能</li>
                <li><a >社区</a></li>

            </ul>
        </div>
        <div id="find_wrap">
            <div id="find_bar">
                <input type="text" id="find_input">
            </div>
            <div id="find_but">GO</div>
        </div>
    </div>
</div>
<div id="menu_content_bg" style="height: 0px;">
    <div id="menu_content_wrap">
        <ul style="top: 0px;">
            <li id="xiaomiphone">

                <div class="menu_content">
                    <img src="img/minote!160x110.jpg">
                    <p class="menu_content_tit">标准版</p>
                    <p class="menu_content_price">1999元起</p>
                </div>

                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/mipad16!160x110.jpg">
                    <p class="menu_content_tit">平板16</p>
                    <p class="menu_content_price">3999元起</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/mipad64!160x110.jpg">
                    <p class="menu_content_tit">平板32</p>
                    <p class="menu_content_price">4999元起</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/mi4!160x110.jpg">
                    <p class="menu_content_tit">标准</p>
                    <p class="menu_content_price">2999元起</p>
                </div>
            </li>
            <li id="hongmiphone">
                <div class="menu_content">
                    <img src="img/hongmi2a!160x110.jpg">
                    <p class="menu_content_tit">红米手机2A</p>
                    <p class="menu_content_price">499元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/hongmi2!160x110.jpg">
                    <p class="menu_content_tit">红米手机2</p>
                    <p class="menu_content_price">599元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/note!160x110.jpg">
                    <p class="menu_content_tit">红米NOTE</p>
                    <p class="menu_content_price">699元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/note2!160x110.jpg">
                    <p class="menu_content_tit">红米NOTE2</p>
                    <p class="menu_content_price">799元</p>
                </div>
            </li>
            <li id="pingban" style="text-align: center">
                <div class="menu_content">
                    <a > <img src="img/biao.jpg"></a>
                    <p class="menu_content_tit">罗宾尼正品全自动机械表</p>
                    <p class="menu_content_price">138元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/biao1.jpg">
                    <p class="menu_content_tit">防水双显手表 新款电子表1002ad</p>
                    <p class="menu_content_price">399元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/biao2.jpg">
                    <p class="menu_content_tit">简约的纯白色与桃红</p>
                    <p class="menu_content_price">266元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/biao3.jpg">
                    <p class="menu_content_tit">手表真皮代用 大海表带</p>
                    <p class="menu_content_price">588元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/baio4.jpg">
                    <p class="menu_content_tit">blooded纯白色的</p>
                    <p class="menu_content_price">189元起</p>
                </div>

            </li>
            <li id="tv" style="text-align: center">
                <div class="menu_content">
                    <img src="img/Dian.jpg">
                    <p class="menu_content_tit">长虹电视机图片40英寸</p>
                    <p class="menu_content_price">5699元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/Dian1.jpg">
                    <p class="menu_content_tit">索尼 KD-55X9000E 55英寸</p>
                    <p class="menu_content_price">2999元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/Dian2.jpg">
                    <p class="menu_content_tit">康佳V55U 55英寸电视机 </p>
                    <p class="menu_content_price">3399元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/Dian3.jpg">
                    <p class="menu_content_tit">三星液晶电视机图片</p>
                    <p class="menu_content_price">6499元起</p>
                </div>

            </li>
            <li id="luyou">
                <div class="menu_content">
                    <img src="img/Mei.jpg"/>
                    <p class="menu_content_tit">碧欧泉修颜平肤隔离霜( 白色 )30ml</p>
                    <p class="menu_content_price">99元起</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/Mei1.jpg"/>
                    <p class="menu_content_tit">百雀羚净白亮肤隔离霜（肤色）50ml</p>
                    <p class="menu_content_price">88元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/Mei2.jpg"/>
                    <p class="menu_content_tit">衣草/檀香木洗发水护发素</p>
                    <p class="menu_content_price">166元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/Mei3.jpg"/>
                    <p class="menu_content_tit">拉芳洗发水/护发素 </p>
                    <p class="menu_content_price">122元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/Mei4.jpg"/>
                    <p class="menu_content_tit">欧芭洗发水/洗发水护发素套装</p>
                    <p class="menu_content_price">139元</p>
                </div>
            </li>

            <li id="yingjian">
                <div class="menu_content">
                    <img src="http://c1.mifile.cn/f/i/15/goods/nav/scale!160x110.jpg">
                    <p class="menu_content_tit">体重称</p>
                    <p class="menu_content_price">99元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/xiaoyi!160x110.jpg">
                    <p class="menu_content_tit">摄像头</p>
                    <p class="menu_content_price">129元起</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/yicamera!160x110.jpg">
                    <p class="menu_content_tit">运动相机</p>
                    <p class="menu_content_price">399元起</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/ihealth!160x110.jpg">
                    <p class="menu_content_tit">血压计</p>
                    <p class="menu_content_price">199元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/chazuo!160x110.jpg">
                    <p class="menu_content_tit">智能插座</p>
                    <p class="menu_content_price">59元</p>
                </div>
                <span class="menu_content_line"></span>
                <div class="menu_content">
                    <img src="img/smart!160x110.jpg">
                    <p class="menu_content_tit">
                        <br>智能硬件</p>
                </div>
            </li>
        </ul>
    </div>
</div>
<div id="big_banner_wrap">
    <ul id="banner_menu_wrap">
        <li class="active"img>
            <a>时尚服装</a>
            <a class="banner_menu_i">&gt;</a>
            <div class="banner_menu_content" style="width: 900px; top: -20px;">
                <ul class="banner_menu_content_ul">

                    <li>
                        <a href="kon.html"><img src="img/nv.jpg"></a>
                        <a href="kon.html">女士外套</a></li>
                    <li>
                        <a href="kon.html"><img src="img/nv1.jpg"></a>
                        <a href="kon.html">红色连衣裙</a></li>
                    <li>
                        <a><img src="img/nv2.jpg"></a>
                        <a>男士套装</a></li>
                    <li>
                        <a href="kon.html"><img src="img/nv3.jpg"></a>
                        <a href="kon.html">圆领T恤</a></li>
                    <li>
                        <a href="kon.html"><img src="img/nv4.jpg"></a>
                        <a href="kon.html">淑女裙</a></li>
                    <li>
                        <a href="kon.html"><img src="img/nv5.jpg"></a>
                        <a href="kon.html">格子大衣</a></li>
                </ul>
                <ul class="banner_menu_content_ul">
                    <li>
                        <a href="kon.html"><img src="img/nv6.jpg"></a>
                        <a href="kon.html">潮流长袖</a></li>
                    <li>
                        <a href="kon.html"><img src="img/nv7.jpg"></a>
                        <a href="kon.html">宝宝棉袄</a></li>
                    <li>
                        <a href="kon.html"><img src="img/nan.jpg"></a>
                        <a href="kon.html">宝宝外套</a></li>
                    <li>
                        <a href="kon.html"><img src="img/nan1.jpg"></a>
                        <a href="kon.html">格子衬衫</a></li>
                    <li>
                        <a href="kon.html"><img src="img/nan3.jpg"></a>
                        <a href="kon.html">牛仔外套</a></li>
                    <li>
                        <a href="kon.html"><img src="img/nan4.jpg"></a>
                        <a href="kon.html">宝宝裤子</a></li>
                </ul>
                <ul class="banner_menu_content_ul">
                    <li>
                        <a href="kon.html"><img src="img/nan5.jpg"></a>
                        <a href="kon.html">T恤</a></li>
                    <li>
                        <a href="kon.html"><img src="img/nan6.jpg"></a>
                        <a href="kon.html">风衣</a></li>
                    <li>
                        <a href="kon.html"><img src="img/nan7.jpg"></a>
                        <a href="kon.html">毛衣</a></li>
                    <li>
                        <a href="kon.html"><img src="img/nan8.jpg"></a>
                        <a href="kon.html">女士西装</a></li>

                    <li>
                        <a href="kon.html"><img src="img/nan9.jpg"></a>
                        <a href="kon.html">宝宝连衣裙</a></li>
                    <li>
                        <a href="kon.html"><img src="img/nan10.jpg"></a>
                        <a href="kon.html">男士西装</a></li>


                </ul>


        <li>
            <a>数码电器</a>
            <a class="banner_menu_i">&gt;</a>
            <div class="banner_menu_content" style="width: 900px; top: -100px;">
                <ul class="banner_menu_content_ul">

                    <li>
                        <a href="kon.html"><img src="img/shu11.jpg"></a>
                        <a href="kon.html">个性手机壳</a></li>
                    <li>
                        <a href="kon.html"><img src="img/shu10.jpg"></a>
                        <a href="kon.html">情侣手机壳</a></li>
                    <li>
                        <a><img src="img/shu9.jpg"></a>
                        <a>炫酷手机壳</a></li>
                    <li>
                        <a href="kon.html"><img src="img/shu8.jpg"></a>
                        <a href="kon.html">电脑星空贴纸</a></li>
                    <li>
                        <a href="kon.html"><img src="img/shu7.jpg"></a>
                        <a href="kon.html">电脑高清贴膜</a></li>
                    <li>
                        <a href="kon.html"><img src="img/shu60.jpg"></a>
                        <a href="kon.html">电脑卡通贴膜</a></li>
                </ul>
                <ul class="banner_menu_content_ul">
                    <li>
                        <a href="kon.html"><img src="img/shu5.jpg"></a>
                        <a href="kon.html">电脑花纹贴纸</a></li>
                    <li>
                        <a href="kon.html"><img src="img/shu4.jpg"></a>
                        <a href="kon.html">有线键盘</a></li>
                    <li>
                        <a href="kon.html"><img src="img/shu3.jpg"></a>
                        <a href="kon.html">康佳头套耳机</a></li>
                    <li>
                        <a href="kon.html"><img src="img/shu2.jpg"></a>
                        <a href="kon.html">vivo耳机</a></li>
                    <li>
                        <a href="kon.html"><img src="img/shu1.jpg"></a>
                        <a href="kon.html">nuoio套头耳机</a></li>
                    <li>
                        <a href="kon.html"><img src="img/shu.jpg"></a>
                        <a href="kon.html">无线键盘</a></li>
                </ul>
                <ul class="banner_menu_content_ul">
                    <li>
                        <a href="kon.html"><img src="img/shu12.jpg"></a>
                        <a href="kon.html">彩色键盘贴</a></li>
                    <li>
                        <a href="kon.html"><img src="img/shu13.jpg"></a>
                        <a href="kon.html">手机贴膜</a></li>
                    <li>
                        <a href="kon.html"><img src="img/shu14.jpg"></a>
                        <a href="kon.html">单色键盘贴</a></li>
                    <li>

                </ul>
            </div>
        </li>
        <li>
            <a>家具家装</a>
            <a class="banner_menu_i">&gt;</a>
            <div class="banner_menu_content" style="width: 900px; top: -146px;">
                <ul class="banner_menu_content_ul">

                    <li>
                        <a href="kon.html"><img src="img/jia12.jpg"></a>
                        <a href="kon.html">四件套</a></li>
                    <li>
                        <a href="kon.html"><img src="img/jia11.jpg"></a>
                        <a href="kon.html">水杯</a></li>
                    <li>
                        <a><img src="img/jia10.jpg"></a>
                        <a href="kon.html">酒杯</a></li>
                    <li>
                        <a href="kon.html"><img src="img/jia9.jpg"></a>
                        <a href="kon.html">抱枕</a></li>
                    <li>
                        <a href="kon.html"><img src="img/jia8.jpg"></a>
                        <a href="kon.html">小清新两扇窗帘</a></li>
                    <li>
                        <a href="kon.html"><img src="img/jia7.jpg"></a>
                        <a href="kon.html">三扇窗帘</a></li>
                </ul>
                <ul class="banner_menu_content_ul">
                    <li>
                        <a href="kon.html"><img src="img/jia6.jpg"></a>
                        <a href="kon.html">1.5米木床</a></li>
                    <li>
                        <a href="kon.html"><img src="img/jia5.jpg"></a>
                        <a href="kon.html">方凳子</a></li>
                    <li>
                        <a href="kon.html"><img src="img/jia4.jpg"></a>
                        <a href="kon.html">餐桌</a></li>
                    <li>
                        <a href="kon.html"><img src="img/jia3.jpg"></a>
                        <a href="kon.html">书桌</a></li>
                    <li>
                        <a href="kon.html"><img src="img/jia2.jpg"></a>
                        <a href="kon.html">电灯</a></li>
                    <li>
                        <a href="kon.html"><img src="img/jia1.jpg"></a>
                        <a href="kon.html">圆凳子</a></li>
                </ul>
                <ul class="banner_menu_content_ul">
                    <li>
                        <a href="kon.html"><img src="img/jia.jpg"></a>
                        <a href="kon.html">彩色电灯</a></li>

                </ul>
            </div>
        </li>
        <li>
            <a>户外运动</a>
            <a class="banner_menu_i">&gt;</a>
            <div class="banner_menu_content" style="width: 600px; top: -188px;">
                <ul class="banner_menu_content_ul">

                    <li>
                        <a href="kon.html"><img src="img/h.jpg"></a>
                        <a href="kon.html">登山鞋</a></li>
                    <li>
                        <a href="kon.html"><img src="img/h1.jpg"></a>
                        <a href="kon.html">睡袋</a></li>
                    <li>
                        <a  href="kon.html"><img src="img/h2.jpg"></a>
                        <a href="kon.html">手电筒</a></li>
                    <li>
                        <a href="kon.html"><img src="img/h3.jpg"></a>
                        <a href="kon.html">背包</a></li>
                    <li>
                        <a href="kon.html"><img src="img/h4.jpg"></a>
                        <a href="kon.html">防晒伞</a></li>
                    <li>
                        <a href="kon.html"><img src="img/h6.jpg"></a>
                        <a href="kon.html">打火机</a></li>

                    <li>
                </ul>
                <ul class="banner_menu_content_ul">
                    <li>
                        <a href="kon.html"><img src="img/yun.jpg"></a>
                        <a href="kon.html">运动套装</a></li>

                    <li>
                        <a href="kon.html"><img src="img/h7.jpg"></a>
                        <a href="kon.html">饮料</a></li>
                    <li>
                        <a href="kon.html"><img src="img/h8.jpg"></a>
                        <a href="kon.html">苹果</a></li>

                    <li>
                        <a href="kon.html"><img src="img/h9.jpg"></a>
                        <a href="kon.html">面包</a></li>

                    <li>
                        <a href="kon.html"><img src="img/timg.jpg"></a>
                        <a href="kon.html">帐篷</a></li>

                </ul>


            </div>
        </li>

        <li>
            <a>美妆个护</a>
            <a class="banner_menu_i">&gt;</a>
            <div class="banner_menu_content" style="width: 900px; top: -272px;">
                <ul class="banner_menu_content_ul">

                    <li>
                        <a href="kon.html"><img src="img/Xie.jpg"></a>
                        <a href="kon.html">卸妆水</a></li>
                    <li>
                        <a href="kon.html"><img src="img/Cc.jpg"></a>
                        <a href="kon.html">cc霜</a></li>
                    <li>
                        <a><img src="img/Xie.jpg"></a>
                        <a>隔离霜</a></li>
                    <li>
                        <a href="kon.html"><img src="img/fen.jpg"></a>
                        <a href="kon.html">粉底</a></li>
                    <li>
                        <a href="kon.html"><img src="img/yanyin.jpg"></a>
                        <a href="kon.html">眼影</a></li>
                    <li>
                        <a href="kon.html"><img src="img/uximiannai0.jpg"></a>
                        <a href="kon.html">洗面奶</a></li>
                </ul>
                <ul class="banner_menu_content_ul">
                    <li>
                        <a href="kon.html"><img src="img/Mianmo.jpg"></a>
                        <a href="kon.html">面膜</a></li>
                    <li>
                        <a href="kon.html"><img src="img/fei.jpg"></a>
                        <a href="kon.html">香皂</a></li>
                    <li>
                        <a href="kon.html"><img src="img/jiemaogaop=0.jpg"></a>
                        <a href="kon.html">睫毛膏</a></li>
                    <li>
                        <a href="kon.html"><img src="img/hong.jpg"></a>
                        <a href="kon.html">口红</a></li>
                    <li>
                        <a href="kon.html"><img src="img/cungao0.jpg"></a>
                        <a href="kon.html">唇膏</a></li>
                    <li>
                        <a href="kon.html"><img src="img/u=fangshai23&gp=0.jpg"></a>
                        <a href="kon.html">防晒霜</a></li>
                </ul>
                <ul class="banner_menu_content_ul">
                    <li>
                        <a href="kon.html"><img src="img/bushui.jpg"></a>
                        <a href="kon.html">补水喷雾</a></li>
                    <li>
                        <a href="kon.html"><img src="img/huazhuang0.jpg"></a>
                        <a href="kon.html">化妆笔</a></li>
                    <li>
                        <a href="kon.html"><img src="img/dizhuang.jpg"></a>
                        <a href="kon.html">底妆</a></li>
                    <li>
                        <a href="kon.html"><img src="img/mian.jpg"></a>
                        <a href="kon.html">化妆棉</a></li>

                    <li>
                        <a href="kon.html"><img src="img/u=170626932,151332030&fm=23&gp=0.jpg"></a>
                        <a href="kon.html">百雀羚套装</a></li>
                </ul>


            </div>
        </li>
        <li>
            <a>手机配件</a>
            <a class="banner_menu_i">&gt;</a>
            <div class="banner_menu_content" style="width: 900px; top: -314px;">
                <ul class="banner_menu_content_ul">
                    <li>
                        <a href="kon.html"><img src="img/tiemo.jpg"></a>
                        <a href="kon.html">贴膜</a></li>
                    <li>
                        <a href="kon.html"><img src="img/zipaigan.jpg"></a>
                        <a href="kon.html">自拍杆</a></li>
                    <li>
                        <a><img src="img/zipaigan.jpg"></a><a>蓝牙手柄</a></li>
                    <li>
                        <a href="kon.html"><img src="img/tizhi.jpg"></a>
                        <a href="kon.html">贴纸</a></li>
                    <li>
                        <a href="kon.html"><img src="img/fangchensai.jpg"></a>
                        <a href="kon.html">防尘塞</a></li>
                    <li>
                        <a href="kon.html"><img src="img/zhijia.jpg"></a>
                        <a href="kon.html">手机支架</a></li>
                </ul>
                <ul class="banner_menu_content_ul">
                    <li>

                        <a href="kon.html"><img src="img/raoxian.jpg"></a>
                        <a href="kon.html">耳机绕线器</a></li>
                    <li>
                        <a href="kon.html"><img src="img/wifi.jpg"></a>
                        <a href="kon.html">随身WIFI</a></li>
                    <li>
                        <a href="kon.html"><img src="img/baohu.jpg"></a>
                        <a href="kon.html">保护套/保护壳</a></li>
                    <li>
                        <a href="kon.html"><img src="img/hougai.jpg"></a>
                        <a href="kon.html">后盖</a></li>
                    <li>
                        <a href="kon.html"><img src="img/dianchi.jpg"></a>
                        <a href="kon.html">电池</a></li>
                    <li>
                        <a href="kon.html"><img src="img/chongdian.jpg"></a>
                        <a href="kon.html">充电器</a></li>
                </ul>
                <ul class="banner_menu_content_ul">
                    <li>
                        <a href="kon.html"><img src="img/xiancai.jpg"></a>
                        <a href="kon.html">线材</a></li>
                    <li>
                        <a href="kon.html"><img src="img/cunchu.jpg"></a>
                        <a href="kon.html">存储卡</a></li>

                </ul>


            </div>
        </li>

        <li>
            <a>其它</a>
            <a class="banner_menu_i">&gt;</a>
            <div class="banner_menu_content" style="width: 900px; top: -360px;">
                <ul class="banner_menu_content_ul">
                    <li>
                        <a href="kon.html"><img src="img/bag.jpg"></a>
                        <a href="kon.html">背包</a></li>
                    <li>
                        <a href="kon.html"><img src="img/shubiaodian.jpg"></a>
                        <a href="kon.html">鼠标坠</a></li>
                    <li>
                        <a href="kon.html"><img src="img/zhoubian.jpg"></a>
                        <a href="kon.html">生活周边</a></li>
                    <li>
                        <a href="kon.html"><img src="img/dianyuan.jpg "></a>
                        <a href="kon.html">移动电源</a>
                    </li>
                    <li>
                        <a href="kon.html"><img src="img/powerscript.jpg"></a>
                        <a href="kon.html">插线板</a>
                    </li>

                    <li>
                        <a href="kon.html"><img src="img/yidongdianyuan.jpg"></a>
                        <a href="kon.html">品牌移动电源</a></li>
                </ul>
                <ul class="banner_menu_content_ul">
                    <li>

                        <a href="kon.html"><img src="img/dianyuanfujian.jpg"></a>
                        <a href="kon.html">移动电源附件</a>
                    </li>
                    <li>
                        <a href="kon.html"><img src="img/headphone.jpg"></a>
                        <a href="kon.html">头戴式耳机</a>
                    </li>
                    <li>
                        <a href="kon.html"><img src="img/huosai.jpg"></a>
                        <a href="kon.html">活塞耳机</a></li>
                    </li>
                    <li>
                        <a href="kon.html"><img src="img/bluetoothheadset.jpg"></a>
                        <a href="kon.html">蓝牙耳机</a></li>
                    <li>
                        <a href="kon.html"><img src="img/erji.jpg"></a>
                        <a href="kon.html">品牌耳机</a>
                    </li>
                </ul>
                <ul class="banner_menu_content_ul">
                    <li>
                        <a href="kon.html"><img src="img/yinxiang.jpg"></a>
                        <a href="kon.html">音箱</a>
                    </li>
                      <li>
                          <a href="kon.html"><img src="img/wan.jpg"></a>
                          <a href="kon.html">玩酷产品</a></li>
                    </li>
                </ul>
            </div>
        </li>
    </ul>

    <div id="big_banner_pic_wrap">
        <ul id="big_banner_pic">
            <li><img src="img/003.png"></li>
            <li><img src="img/004.png"></li>
            <li><img src="img/005.jpg"></li>
            <li><img src="img/001.jpg"></li>
            <li><img src="img/002.jpg"></li>

        </ul>
    </div>
    <div id="big_banner_change_wrap">
        <div id="big_banner_change_prev"> &lt;</div>
        <div id="big_banner_change_next">&gt;</div>
    </div>
</div>
<div id="head_hot_goods_wrap">
    <div id="head_hot_goods_title">
        <span class="title_span">热卖单品</span>
        <div id="head_hot_goods_change">
            <span id="head_hot_goods_prave"><</span>
            <span id="head_hot_goods_next">></span>
        </div>
    </div>
    <div id="head_hot_goods_content" >
        <ul>
            <li class="floor_goods_wrap_li"  ng-repeat="(x, value) in myObj">

                <a ng-click="findById(value.c_id,value.retail_price,value.c_name,value.picture,value.label,value.normal_price)"onclick="a()"><img src="{{value.picture}}"></a>
                <a ng-click="findById(value.c_id,value.retail_price,value.c_name,value.picture,value.label,value.normal_price)"onclick="a()">{{value.c_name}}</a>
                <a ng-click="findById(value.c_id,value.retail_price,value.c_name,value.picture,value.label,value.normal_price)"onclick="a()">{{value.label}}</a>
                <a style="color:  #FF6700;margin-top: 20px;"  ng-click="findById(value.c_id,value.retail_price,value.c_name,value.label,value.normal_price)"onclick="a()">{{value.retail_price}}<span hidden>{{value.normal_price}}</span></a>

            </li>
        </ul>
    </div>
</div>

<div id="main_show_box">
    <div id="floor_1">
        <div id="floor_head">
            <span class="title_span">服装</span>
        </div>
    </div>
    <div class="floor_goods_wrap" >
        <ul>

            <li class="floor_goods_wrap">
                <a><img src="img/chang.jpg"></a>
            </li>

            <li class="floor_goods_wrap_li"  ng-repeat="(x, value) in  yi">
                <a ng-click="findById(value.c_id,value.retail_price,value.c_name,value.picture,value.label,value.normal_price)"onclick="a()"  class="floor_goods_img"><img src="{{value.picture}}"></a>
                <a ng-click="findById(value.c_id,value.retail_price,value.c_name,value.picture,value.label,value.normal_price)"onclick="a()" class="floor_goods_tit">{{value.c_name}}</a>
                <a ng-click="findById(value.c_id,value.retail_price,value.c_name,value.picture,value.label,value.normal_price)" onclick="a()" class="floor_goods_txt">{{value.label}}</a>
                <a ng-click="findById(value.c_id,value.retail_price,value.c_name,value.picture,value.label,value.normal_price)" onclick="a()" class="floor_goods_price">{{value.retail_price}}</a>
            </li>
            <div style="clear:both;"></div>
        </ul>
    </div>
</div>
<div id="foot_box">
    <div id="foot_wrap">
        <div class="foot_top">
            <ul>
                <li>1小时快修服务</li>
                <li class="font_top_i">|</li>
                <li>7天无理由退货</li>
                <li class="font_top_i">|</li>
                <li>15天免费换货</li>
                <li class="font_top_i">|</li>
                <li>满150元包邮</li>
                <li class="font_top_i">|</li>
                <li>520余家售后网点</li>
            </ul>
        </div>
        <div class="foot_bottom">
            <div class="foot_bottom_l">
                <dl>
                    <dt>帮助中心</dt>
                    <dd>购物指南</dd>
                    <dd>支付方式</dd>
                    <dd>配送方式</dd>
                </dl>
                <dl>
                    <dt>服务支持</dt>
                    <dd>售后政策</dd>
                    <dd>自助服务</dd>
                    <dd>相关下载</dd>
                </dl>
                <dl>
                    <dt>绿顺之家</dt>
                    <dd>绿顺之家</dd>
                    <dd>服务网点</dd>
                    <dd>预约亲临到店服务</dd>
                </dl>
                <dl>
                    <dt>关注我们</dt>
                    <dd>新浪微博</dd>
                    <dd>绿顺部落</dd>
                    <dd>官方微信</dd>
                </dl>
            </div>
            <div class="foot_bottom_r">
                <a>400-660-6989</a>
                <a>周一至周日 8:00-18:00</a>
                <a>（仅收市话费）</a>
                <span> 24小时在线客服</span>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="js/xiaomi.js"></script>
<script src="/js/angular/angular.min.js" type="text/javascript"></script>

<script type="text/javascript">

        var app = angular.module('myApp', []);
        app.controller('CommodityController', function($scope,$http) {
            $http.get("/comm/findAllByTo").success(function (data,status,header,config) {
                $scope.yi =data;
            });
            $http({
                method: 'POST',
                url: '/comm/findAll'
            }).then(function successCallback(response) {
                angular.forEach(response.data, function(data,index,array){
                    $scope.myObj=response.data;
                });
            }, function errorCallback(response) {

            });

            $scope.findById = function(id,money,c_name,picture,label,normal_price) {
                //参数


                var params={ 'money':money,"id":id ,"c_name":c_name,"picture":picture,"label":label,"normal_price":normal_price};
                $http({
                    method:'POST',

                    url:'/comm/findById?id='+id+"&money="+money+"&c_name="+c_name+"&picture="+picture+"&label="+label+"&normal_price="+normal_price,

                    data:params,
                    dataType:'text',
                }).success(function(data, status, headers, config){
                    //处理返回值 进行跳转
                    console.log(data);
                    window.location="/Xi.jsp?id="+id+"&money="+money+"&c_name="+c_name+"&picture="+picture+"&label="+label+"&normal_price="+normal_price;

                }).error(function(data, status, headers, config){

                })
            }
        });

       function a() {
         var username = <%=request.getParameter("username")%>
         if(username==null){
         alert("请先登录,后进行购买！");
         window.location="login.html";
         }
         }
         $( function b() {
         var username = <%=request.getParameter("username")%>
         if(username==null){
         $("#b").text('你好，请登录');
         }else{
         $("#b").text(username);
         }
         });

</script>
</body>
</html>


