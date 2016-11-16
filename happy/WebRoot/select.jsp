<%@page import="entity.grade"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
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
form {
    top:20%;
	font-size: 30px;
	color: blue;

}
</style>
<br><br><br><br><br>
	<div  align="center" >
		<form action="selectOne" method="post">
			请输入要查询学生的学号：<br><br><input type="text" name="sno" size="30px"><br><br>
			<input type="submit" value="查询">
		</form>
	</div>
	 <div class='corner'>
		<a href="showTeacher.jsp">返回</a>
	</div>
</body>
</html>