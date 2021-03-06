<!DOCTYPE html>
<html>
<head>
    <%@ page language="java" pageEncoding="UTF-8"%>
    <meta charset="utf-8">
    <link rel="stylesheet" href="/js/bootstrap.min.css">
    <script src="../scripts/jquery-1.6.2.min.js"></script>
    <script src="../js/angular/angular.min.js"></script>
    <link rel="shortcut icon" href="favicon.ico"> <link href="/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="/css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="/css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="/css/animate.css" rel="stylesheet">
    <link href="/css/style.css?v=4.1.0" rel="stylesheet">


</head>
<body ng-app="myApp" ng-controller="CommodityController">

<div class="container">
    <button class="btn btn-success" ng-click="addComm()">
        <span class="glyphicon glyphicon-edit" ></span><a href="addComm.html" class="a">创建新商品</a>
    </button>
    <table class="table table-striped">
        <thead>
        <tr>

            <th>商品编号</th>
            <th>商品名称</th>
            <th>商品品牌</th>
           <!-- <th>商品图片</th>-->
            <th>正常价格</th>
          <!--  <th>零售价格</th>-->
           <!-- <th>商品状态</th>-->
            <th>商品介绍</th>
            <th>商品属性</th>
           <!-- <th>商品标签</th>-->
            <th>商品库存</th>
           <!-- <th>商品大类</th>
            <th>商品子类别</th>-->
            <th>商品创建时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr ng-repeat="comm in comms">
            <td>{{comm.c_id}}</td>
            <td>{{comm.c_name}}</td>
            <td>{{ comm.brand }}</td>
          <!--  <td>{{comm.picture}}</td>-->
            <td>{{comm.normal_price}}</td>
           <!-- <td>{{ comm.retail_price }}</td>-->
         <!--   <td>{{comm.c_state}}</td>-->
            <td>{{comm.introduce}}</td>
            <td>{{comm.property}}</td>
           <!-- <td>{{ comm.label }}</td>-->
            <td>{{ comm.inventory }}</td>
            <!--<td>{{ comm.broad_heading }}</td>
            <td>{{ comm.subclass }}</td>-->
            <td>{{ comm.cdate }}</td>

            <td>
                <button type="button" class="btn btn-info" ng-click="findByIds(comm.c_id,comm.normal_price,comm.retail_price,comm.inventory)" >编辑</button>
                <button type="button" class="btn btn-danger" ng-click="delete(comm.c_id)" >删除</button>

            </td>
        </tr>
        </tbody>
    </table>

</div>

</div>

<script>

    var app = angular.module('myApp', []);
    app.controller('CommodityController', function($scope,$http) {
        $http.get("/comm/findAll").success(function (data,status,header,config) {
            $scope.comms =data;
        });


        $scope.delete = function(id){
            $http(
                {   method:'POST',
                    url:'/comm/delete?id='+id,

                }
            ).success(function(data) {

                window.location.reload();
            });
        }
        $scope.findByIds = function(id,normal_price,retail_price,inventory) {
            //参数
            var params={ 'normal_price':normal_price,"id":id ,"retail_price":retail_price,"inventory":inventory};
            $http({
                method:'POST',

              url:'/comm/findById?id='+id+"&normal_price="+normal_price+"&retail_price="+retail_price+"&inventory="+inventory,

                data:params,
                dataType:'text',
            }).success(function(data, status, headers, config){
                //处理返回值 进行跳转
                console.log(data);
               window.location="/user/updateComm.jsp?id="+id+"&normal_price="+normal_price+"&retail_price="+retail_price+"&inventory="+inventory;


            }).error(function(data, status, headers, config){

            })
        }

/* $scope.edit=function (id,normal_price,retail_price,inventory) {
        window.location("/updateComm.jsp?id="+id+"&normal_price="+normal_price+"&retail_price="+retail_price+"&inventory="+inventory)

 }*/

    });
</script>
<script src="/js/plugins/iCheck/icheck.min.js"></script>
<script>

    $(document).ready(function () {
        $('.i-checks').iCheck({
            checkboxClass: 'icheckbox_square-green',
            radioClass: 'iradio_square-green',
        });
    });
</script>
<style>
    .a{
        text-decoration: none;
        list-style: none;
        color: white;
    }
</style>

</body>
</html>