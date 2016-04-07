<%--
  Created by IntelliJ IDEA.
  User: xd
  Date: 2016/3/4
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<html>
<head>
    <title>用户发布列表</title>
</head>
  <body>
  <capital>我发布的项目列表</capital>
  <table border="1">
    <jstl:forEach items="${projectList}" var="item">
      <tr>
        <td>项目名称: ${item.projectname}</td>
        <td>联系人名: ${item.projecttopersonname}</td>
        <td>联系方式: ${item.projecttoemail}</td>
        <td>项目描述: ${item.projectintroduction}</td>
      </tr>
    </jstl:forEach>
  </table>
  <br><hr>
  <capital>我发布的项目列表</capital>
  <table border="1">
    <jstl:forEach items="${teamWantList}" var="teamwant">
      <tr>
        <td>团队标题: ${teamwant.teamname}</td>
        <td>招人信息: ${teamwant.wantinfo}</td>
        <td>队长姓名: ${teamwant.username}</td>
        <td>发布时间: ${teamwant.createtime}</td>
      </tr>
    </jstl:forEach>
  </table>
  <br><hr>
  <button onclick="location='../user/distribute'">发布项目</button>
  <button onclick="location='../user//editInfo'">编辑个人信息</button>
  <%--<button onclick="location='/user/distribute'">发布项目</button>--%>
  </body>
</html>
