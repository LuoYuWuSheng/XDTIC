<%--
  Created by IntelliJ IDEA.
  User: xd
  Date: 2016/3/6
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>个人信息</title>
</head>
<body>
  <form:form commandName="${Tuser}" action="../user/save" method="get" >
    头像:<form:input path="" type="image" name="userImage"/>
    性别:  女<form:radiobutton path="${null}" type="radio" value="1" name="statue" />男<form:radiobutton path="${null}" type="radio" value="0" name="sex">
    用户名: <form:input path="${Tuser.username}" type="text" name="name" /><br>
    这样设密码很不安全<br>
    密码: <form:input path="${Tuser.password}" type="text" name="password" /><br>
    陈苗的数据库好坑<br>
    部门: <form:input path="${Tuser.apartmentid}" type="text" name="department" /><br>
    这里也不对，没有这个表<br>
    学院: <form:input path="${Tuser.schoolid}" type="text" name="college" /><br>
    电话: <form:input path="${Tuser.telchone}" type="text" name="telephone" /><br>
    邮箱: <form:input path="${Tuser.email}" type="text" name="emil" /><br>
    技术特长: <form:input path="${Tuser.skill}" type="text" name="speciality" /><br>
    <input type="submit" value="Submit" />
  </form:form>:form>
  <br>
</body>
</html>
