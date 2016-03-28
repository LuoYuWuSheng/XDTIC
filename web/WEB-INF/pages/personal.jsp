<%--
  Created by IntelliJ IDEA.
  User: xd
  Date: 2016/3/6
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
</head>
<body>
  <form action="../user/save" method="get">
    头像:<input type="image" name="userImage"/>
    性别:  女<input type="radio" value="1" name="statue" />男<input type="radio" value="0" name="sex">
    用户名: <input type="text" name="name" /><br>
    密码: <input type="text" name="password" /><br>
    部门: <input type="text" name="department" /><br>
    学院: <input type="text" name="college" /><br>
    电话: <input type="text" name="telephone" /><br>
    邮箱: <input type="text" name="emil" /><br>
    技术特长: <input type="text" name="speciality" /><br>
    <input type="submit" value="Submit" />
  </form><br>

</body>
</html>
