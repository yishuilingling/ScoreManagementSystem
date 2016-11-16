<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<head size=20>
欢迎使用成绩管理系统！
<title>登录</title>
</head>
<body>

	<style>
body {
	background-image: url(./img/bg.png);
}

.mess {
	position: absolute;
	left: 43%;
	top: 15%;
	font-size:25px;
	color:blue;
}
</style>

	<div class='mess'>
		<form action="loginServlet" method="post">
			<br> 姓 名:<input type="text" name="name" size=16><br><br>
			密 码:<input type="password" name="password" size=16>
			<p style="font-size:20px">&nbsp;<input type="radio"
				name="type" value="student">学生 &nbsp; <input type="radio"
				name="type" value="teacher">教师</p>
			 &nbsp;&nbsp;<input type="submit"
				value="登录" size=10>&nbsp; &nbsp; <input type="reset"
				value="重置" size=10> <br>
		</form>
	</div>
</body>
</html>
