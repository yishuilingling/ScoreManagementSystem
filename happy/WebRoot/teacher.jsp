<%@page import="entity.teacher"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'teacher.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<style>
body {
	background-image: url(./img/bg.png);
}

.mess {
	position: absolute;
	left: 35%;
	top: 15%;
	font-size: 27px;
	color: blue;
	width: 40%;
}

.corner {
	position: absolute;
	bottom: 10%;
	right: 10%;
}

th {
	font-size: 23px;
	color: blue;
}
</style>
	<%
		ArrayList<teacher> a = (ArrayList) session.getAttribute("tlist");
	%>
	<div class='mess'>
		<fieldset>
			<legend>您的详细信息如下：</legend>
			<br>
			<table>

				<tr height=50px>
					<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;教师编号：</th>
					<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=a.get(0).getTno()%></th>
				</tr>
				<tr height=50px>
					<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;教师姓名：</th>
					<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=a.get(0).getTname()%></th>
				</tr>
				<tr height=50px>
					<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;教师性别：</th>
					<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=a.get(0).getTsex()%></th>
				</tr>
				<tr height=50px>
					<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;教师电话：</th>
					<th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=a.get(0).getTel()%></th>
				</tr>
			</table>
			<br>
		</fieldset>
	</div>
	<div class='corner'>
		<a href="showTeacher.jsp">返回</a>
	</div>
</body>
</html>
