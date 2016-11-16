<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="entity.grade"%>
<html>
<head>
</head>

<body>
	<style>
body {
	background-image: url(./img/bg.png);
}

.corner {
	position: absolute;
	bottom: 10%;
	right: 10%;
}

.mess {
	position: absolute;
	left: 20%;
	top: 15%;
	font-size:30pt;
	color:blue;
}
th{
font-size:25px;
	color:blue;
}
</style>
<p style="color:blue">
	<%
		String name = (String) session.getAttribute("name");
	%>
	<a href="studentServlet"><%=name%></a>
	<%
		String str = "同学,欢迎登录成绩管理系统!";
		out.print(str);
	%>
	</p>
	<div class='mess'>
		<table>
			<tr>
				<th width=150px>成绩编号</th>
				<th width=150px>学生编号</th>
				<th width=150px>课程名称</th>
				<th width=150px>课程成绩</th>
				<th width=150px>课程教师</th>
			</tr>
			<%
				ArrayList a = (ArrayList) session.getAttribute("list");
				if (a != null) {
					Iterator i = a.iterator();
					grade tmpMi;
					while (i.hasNext()) {
						tmpMi = (grade) i.next();
						out.print("<tr>");
						out.print("<th>");
						out.print(tmpMi.getId());
						out.print("</th>");
						out.print("<th>");
						out.print(tmpMi.getSno());
						out.print("</th>");
						out.print("<th>");
						out.print(tmpMi.getCourse());
						out.print("</th>");
						out.print("<th>");
						out.print(tmpMi.getScore());
						out.print("</th>");
						out.print("<th>");
						out.print(tmpMi.getTname());
						out.print("</th>");
						out.print("</tr>");
					}
				}
			%><tr></tr>
		</table>
	</div>
	
	<div class='corner'>
		<a href="login.jsp">退出系统</a>
	</div>
</body>
</html>
