<%--
  Created by IntelliJ IDEA.
  User: 宝龙
  Date: 2017/5/12
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/FileUpload/fileUpload_ajax" method="post" enctype="multipart/form-data">
    <input type="file" name="file" /> <input type="submit" value="Submit" /></form>
<img alt="" src="${fileUrl }" />
</body>
</html>
