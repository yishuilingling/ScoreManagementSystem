<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
 <body onload="shownum()"> 
 <style>
body {
	background-image: url(./img/bg.png);
}
</style>
             登录失败！ <br>
    即将自动跳转到登录页面<br>
 <script type="text/javascript">  
  var i = 6;
  function shownum(){  
   i=i-1;
   document.getElementById("time").innerHTML=i+"秒后自动跳转登陆 界面"; 
   setTimeout('shownum()',1000);
    } 
    </script> 
 <meta http-equiv="refresh" content ="5;url=<%=basePath%>login.jsp"> 
  </body>
</html>
