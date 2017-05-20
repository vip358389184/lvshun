<!DOCTYPE html>
<html lang="en">
<head>
    <%@ page language="java" pageEncoding="UTF-8"%>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="../scripts/jquery-1.6.2.min.js" type="text/javascript"></script>
    <link rel="shortcut icon" href="favicon.ico"> <link href="/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="/css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="/css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="/css/animate.css" rel="stylesheet">
    <link href="/css/style.css?v=4.1.0" rel="stylesheet">
    <script src="../scripts/ajaxfileupload.js"></script>
    <%request.setAttribute("normal_price",request.getParameter("normal_price"));%>
    <%request.setAttribute("retail_price",request.getParameter("retail_price"));%>
    <%request.setAttribute("inventory",request.getParameter("inventory"));%>
    <%request.setAttribute("normal_price",request.getParameter("normal_price"));%>
</head>
<body ng-app="myApp" ng-controller="CommodityController" >
<div class="row">
    <div class="col-sm-12">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>修改商品 <small></small></h5>
                <div class="ibox-tools">
                    <a class="collapse-link">
                        <i class="fa fa-chevron-up"></i>
                    </a>
                    <a class="dropdown-toggle" data-toggle="dropdown" href="form_basic.html#">
                        <i class="fa fa-wrench"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="form_basic.html#">选项1</a>
                        </li>
                        <li><a href="form_basic.html#">选项2</a>
                        </li>
                    </ul>
                    <a class="close-link">
                        <i class="fa fa-times"></i>
                    </a>
                </div>
            </div>
            <div class="ibox-content">
                <div class="form-group">
                    <label class="col-sm-2 control-label">正常价格</label>

                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="price" ng-model="normal_price" value="<%=request.getParameter("normal_price")%>">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">零售价格</label>

                    <div class="col-sm-10">
                        <input type="text" class="form-control" ng-model="retail_price" id="retail_price" value="<%=request.getParameter("retail_price")%>">
                    </div>
                </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">商品库存</label>

                        <div class="col-sm-10">
                            <input type="text" class="form-control" ng-model="inventory" id="inventory" value="<%=request.getParameter("inventory")%>">
                        </div>
                    </div>
                    <div class="hr-line-dashed"></div>
                    <div class="form-group">
                        <div class="col-sm-4 col-sm-offset-2">
                            <button class="btn btn-primary" type="submit" ng-click="edit()">保存内容</button>
                            <button class="btn btn-white" type="submit">取消</button>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>

 <script src="../js/angular/angular.min.js" type="text/javascript"></script>
 <script>
     function getrequest() {
         var url = location.search;
         var theRequest = new Object();
         if (url.indexOf("?") != -1) {
             var str = url.substr(1);
             strs = str.split("&");
             for (var i = 0; i < strs.length; i++) {
                 theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1])
             }
         }
         return theRequest;
     }
     var app = angular.module('myApp', []);
     app.controller('CommodityController', function($scope,$http) {
         $scope.edit = function () {

             var normal_price = $("#price").val();
             var retail_price = $("#retail_price").val();
             var inventory = $("#inventory").val();
             var c_id = getrequest().id;
             $http({
                 method: 'POST',
                 url:'/comm/update?c_id='+c_id+'&normal_price='+normal_price+'&retail_price'+retail_price+'&inventory='+inventory,
                // url: '/comm/update?c_id='+c_id+'&Commodity_id='+Commodity_id+'&c_name='+c_name,


             }).success(function () {
                 alert("修改成功！");
                 window.location = "datagridComm.jsp"
             }).error(function(){
                 alert("修改成功");
                 window.location = "datagridComm.jsp"
             })

         };
     });
 </script>
</body>
</html>