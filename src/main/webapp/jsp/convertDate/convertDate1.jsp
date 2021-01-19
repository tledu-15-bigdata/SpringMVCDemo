<%--
  Created by IntelliJ IDEA.
  User: zhangyu
  Date: 2020/4/21
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <script type="text/javascript" src="../../js/jquery-3.2.1.min.js"></script>
</head>
<body>
<form action="http://localhost:8080/SpringMVCDemo/convertDate1" method="post">
    账 号：<input type="text" name="acc"><br/>
    密 码：<input type="password" name="pwd"><br/>
    确 认 密 码：<input type="password" name="againpwd"><br/>
    地 址：<input type="text" name="address"><br/>
    手 机 号 码：<input type="text" name="phone"><br/>
    电 子 邮 箱：<input type="text" name="email"><br/>
    生日：<input type="date" name="birth"><br/>
    爱好：<input type="checkbox" name="happy" value="篮球">篮球<br/>
          <input type="checkbox" name="happy" value="足球">足球<br/>
          <input type="checkbox" name="happy" value="乒乓球">乒乓球<br/>
    <input type="submit"/>


</form>
</body>
<script>


</script>
</html>
