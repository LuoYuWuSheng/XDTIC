<%--
  Created by IntelliJ IDEA.
  User: xd
  Date: 2016/3/2
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
  <body>
      <form action="../user/login" method="get">
        id: <input type="text" name="id" />
        password: <input type="text" name="password" />
        <input type="submit" value="Submit" />
      </form>
  </body>
</html>
