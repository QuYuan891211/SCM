<%--
  Created by IntelliJ IDEA.
  User: qy
  Date: 2018/4/28
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
      <form method="post" action="${pageContext.request.contextPath}/dept/insertDept.action">
        名称：<input type="text" width="100px" name="name"><br>
        电话：<input type="text" width="100px" name="phoneNum"><br>
        <input type="submit" width="50px" value="submit">
      </form>
  </body>
</html>
