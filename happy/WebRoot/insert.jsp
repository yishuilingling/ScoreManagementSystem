<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<html>
<body>
	<style>
body {
	background-image: url(./img/bg.png);
}

.mess {
	position: absolute;
	left: 35%;
	top: 10%;
	font-size: 30px;
	color: blue;
	width: 40%;
}
.corner {
	position: absolute;
	bottom: 10%;
	right: 10%;
}

</style>
	<div class='mess'>
		<form action="insertServlet" method="post">
			成绩编号：<input type="text" name="id"><br><br> 学生编号：<input
				type="text" name="sno"><br><br> 课程名称：<input type="text"
				name="course"><br><br> 课程成绩：<input type="text" name="score"><br><br>
			老师姓名：<input type="text" name="tname"><br> <br>
			&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit"
				value="提交"> &nbsp; &nbsp; <input type="reset" value="重置"><br>
		</form>
	</div>
	<div class='corner'>
		<a href="showTeacher.jsp">返回</a>
	</div>
</body>
</html>
