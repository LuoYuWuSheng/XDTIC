<%--
  Created by IntelliJ IDEA.
  User: xd
  Date: 2016/3/23
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>我想做项目</title>
</head>
<body>
<table border="1">
  <jstl:forEach items="${list}" var="item">
    <tr>
      <td>项目名称: ${item.projectname}</td>
      <td>联系人名: ${item.projecttopersonname}</td>
      <td>联系方式: ${item.projecttoemail}</td>
      <td>项目描述: ${item.projectintroduction}</td>
    </tr>
  </jstl:forEach>
</table>
</body>
</html>
