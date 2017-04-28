<%--
  Created by IntelliJ IDEA.
  User: 宝龙
  Date: 2017/4/28
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="  " %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="search-t">
    <form name="sample_clazz_search_form" id="sample_clazz_search_form" method="get">
        <input type="hidden" name="method" value="page"/>
        名称：
        <input type="text" id="name" name="name" class="s1 gray" value="${params.name}">　

        <input type="submit" class="button_search" name="Submit" value="搜索">　
        <input type="button" value="重置" name="Submit" class="button_add" onclick="resetFormByElement(this)">
    </form>
</div>
<form name="sample_clazz_page_form" id="sample_clazz_page_form" method="post">
    <table width="100%" border="0" cellpadding="0" cellspacing="0" class="stripe Tabmember">
        <tr>
            <th width="50" height="38"><input type="checkbox" onclick="selectOrClearAll(this)" class="ng-valid ng-dirty"></th>
            <th>班级名称</th>
            <th>班长</th>
            <th>添加时间</th>
            <th>学生人数</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${clazzs}" var="item" varStatus="status">
            <tr>
                <td height="38"><input type="checkbox" value="${item.id}" data-ng-model="item.selected" name="items" id="checkbox${item.id}" class="ng-pristine ng-valid"></td>
                <td>${item.name}</td>
                <td>${item.monitorId}</td>
                <td>${item.addTimeStr}</td>
                <td><a href="${ctx}/jsp/admin/sample/student/do.jsp?method=page&clazzId=${item.id}">${item.clazzCnt}</a></td>
                <td>
                    <a href="?method=edit&id=${item.id}">修改</a>&nbsp;
                    <a href="javascript:;" onclick="doDel(${item.id},this)">删除</a>&nbsp;
                </td>
            </tr>
        </c:forEach>
    </table>

</form>

</body>
</html>
