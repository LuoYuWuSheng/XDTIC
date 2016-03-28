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
    <title>团队招人列表</title>
</head>
<body>
<table border="1">
  <jstl:forEach items="${list}" var="teamwant">
    <tr>
      <td>团队标题: ${teamwant.teamname}</td>
      <td>招人信息: ${teamwant.wantinfo}</td>
      <td>队长姓名: ${teamwant.username}</td>
      <td>发布时间: ${teamwant.createtime}</td>
    </tr>
  </jstl:forEach>
</table>
</body>
</html>
