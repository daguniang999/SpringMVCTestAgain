<%--<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/fmt" %>--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: chenxiaowei
  Date: 2020/4/25
  Time: 11:21 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <form action="${pageContext.request.contextPath}/loginCheck" method="post">
          <input type="text" name="username"/><br>
          <input type="text" name="password"/><br>
          <input type="submit" value="提交">

      </form>

  </body>
</html>
