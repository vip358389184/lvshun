<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>商品管理</title>

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/jquery-easyui-1.3.6/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/jquery-easyui-1.3.6/themes/icon.css">
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/jquery-easyui-1.3.6/jquery.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/jquery-easyui-1.3.6/jquery.easyui.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/jquery-easyui-1.3.6/locale/easyui-lang-zh_CN.js"></script>

    <script type="text/javascript">
        var url;
        function searchCommodity() {


        }
        function openComodityAddDialog() {
            $("#dlg").dialog("open").dialog("setTitle", "添加商品信息");
            url = "/Commodity/addComm";
            $("#cid").val("");
            $("#cdate").val("");
            $("#cname").val("");

        }

        function openCommodityModifyDialog() {
            var selectedRows = $("#dg").datagrid("getSelections");
            if (selectedRows.length != 1) {
                $.messager.alert("系统提示", "请选择一条要编辑的数据！");
                return;
            }
            var row = selectedRows[0];
            $("#dlg").dialog("open").dialog("setTitle", "编辑商品信息");
            $("#fm").form("load", row);
            $.post(url="/Commodity/getbyid?cid="+selectrow[0].id);
        }

        function saveCommodity() {
            $("#fm").form("submit", {
                url : url,

                success : function(result) {
                    var result = eval('(' + result + ')');
                    if (result.success) {
                        $.messager.alert("系统提示", "保存成功！");
                        resetValue();
                        $("#dlg").dialog("close");
                        $("#dg").datagrid("reload");
                    } else {
                        $.messager.alert("系统提示", "保存失败！");
                        return;
                    }
                }
            });
        }

        function resetValue() {
            $("#name").val("");
            $("#password").val("");

        }

        function closeCommodityDialog() {
            $("#dlg").dialog("close");
            resetValue();
        }

        function deleteCommodity() {
            var selectedRows = $("#dg").datagrid("getSelections");

            if (selectedRows.length == 0) {
                $.messager.alert("系统提示", "请选择要删除的数据！");
                return;
            }
            var strIds = [];
            for ( var i = 0; i < selectedRows.length; i++) {
                strIds.push(selectedRows[i].id);
            }
            var ids = strIds.join(",");

            $.messager.confirm("系统提示", "您确定要删除这<font color=red>"
                + selectedRows.length + "</font>条数据吗？", function(r) {
                if (r) {
                    $.post("/Commodity/delete", {
                        ids : ids
                    }, function(result) {
                        if (result.success) {
                            $.messager.alert("系统提示", "数据已成功删除！");
                            $("#dg").datagrid("reload");
                        } else {
                            $.messager.alert("系统提示", "数据删除失败，请联系系统管理员！");
                        }
                    }, "json");
                }
            });
        }
    </script>
</head>

<body style="margin: 1px">

<table id="dg" title="商品管理" class="easyui-datagrid" fitColumns="true"
       pagination="true" rownumbers="true"
       url="/Commodity/findAll" fit="true"
       toolbar="#tb">
    <thead>
    <tr>
        <th field="cb" checkbox="true" align="center"></th>
        <th field="cid" width="50" align="center">编号</th>
        <th field="cname" width="50" align="center">商品名称</th>
        <th field="cdate" width="50" align="center">商品创建时间</th>

    </tr>
    </thead>
</table>
<div id="tb">
    <a onclick="openComodityAddDialog()" class="easyui-linkbutton"
       iconCls="icon-add" plain="true">添加</a> <a
        onclick="openCommodityModifyDialog()" class="easyui-linkbutton"
        iconCls="icon-edit" plain="true">修改</a> <a
        onclick="deleteCommodity()"class="easyui-linkbutton"
        iconCls="icon-remove" plain="true">删除</a>
    <div>
        &nbsp;商品名称：&nbsp;<input type="text" id="cname" size="20"
                               onkeydown="if(event.keyCode == 13)searchCommodity()" /> <a
            onclick="searchCommodity()"  class="easyui-linkbutton"
            iconCls="icon-search" plain="true">查询</a>
    </div>

    <div id="dlg-buttons">
        <a onclick="saveCommodity()" class="easyui-linkbutton"
           iconCls="icon-ok">保存</a>
        <a onlick="closeCommodityDialog()" class="easyui-linkbutton"
           iconCls="icon-cancel">关闭</a>
    </div>

    <div id="dlg" class="easyui-dialog"
         style="width: 730px;height:280px;padding:10px 10px;" closed="true"
         buttons="#dlg-buttons">
        <form method="post" id="fm">
            <table cellspacing="8px;">
                <tr>
                    <td width="300px;">商品编号：</td>
                    <td><input type="text" id="id" name="cid"
                               class="easyui-validatebox" required="true" /><span
                            style="color: red">*</span>
                    </td>
                    <td>商品名称：</td>
                    <td><input type="text" id="name" name="cname"
                               class="easyui-validatebox" required="true" />&nbsp;<span
                            style="color: red">*</span>
                    </td>
                    <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td>商品创建时间：</td>
                    <td><input type="text" id="cdate" name="cdate"
                               class="easyui-validatebox" required="true" />&nbsp;<span
                            style="color: red">*</span>
                    </td>
                </tr>

            </table>
        </form>
    </div>
</body>
</html>