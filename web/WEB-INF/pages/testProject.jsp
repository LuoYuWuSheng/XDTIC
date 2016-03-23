<%--
  Created by IntelliJ IDEA.
  User: xd
  Date: 2016/2/28
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>项目的测试</title>
</head>
  <body>
    <hr>
        <form action="../project/projectSave" method="get">
          项目名称: <input type="text" name="name" /><br>
          项目联系人姓名: <input type="text" name="ownername" /><br>
          email: <input type="text" name="email" /><br>
          电话: <input type="text" name="telephone" /><br>
          介绍: <input type="text" name="description" /><br>
          状态:  已完成-<input type="radio" value="1" name="statue" /> 我想做—<input type="radio" value="0" name="statue">
          <input type="submit" value="Submit" />
        </form><br>
    <hr>
        <form action="../teamWant/teamWantSave" method="get">
            团队名称: <input type="text" name="name" /><br>
            团队所属项目编号: <input type="text" name="projectid" /><br>
            招募信息: <input type="text" name="teamwantinfo" /><br>
            是否招募:  是-<input type="radio" value="1" name="statue" /> 否—<input type="radio" value="0" name="statue">
            <input type="submit" value="Submit" />
        </form><br>
    <hr>
        <form action="user/login" method="get">
            id: <input type="text" name="id" />
            password: <input type="text" name="password" />
            <input type="submit" value="Submit" />
        </form>
  </body>
</html>
