<%--
  Created by IntelliJ IDEA.
  User: chenxiaowei
  Date: 2020/5/14
  Time: 5:48 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/loginCheck" method="post">
        <input type="text" name="username"/><br>
        <input type="text" name="password"/><br>
        <input type="submit" value="提交">
        <br>
<%--        <input id="remember_me" name="remember-me" type="checkbox">--%>
<%--        <label for="remember_me" class="inline">remember me</label>--%>
    </form>
</body>
</html>
