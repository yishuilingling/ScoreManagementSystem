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
.mess {
	position: absolute;
	left: 35%;
	top: 10%;
	font-size: 30px;
	color: blue;
	width: 40%;
}

</style>
<div class='mess'>
     <br>
  <form action="updateServlet" method="post">
    成绩编号：<input type="text" name="id"><br><br>
    课程成绩：<input type="text" name="score"><br>
     <br>
     &nbsp; &nbsp;&nbsp; <input type="submit" value="提交">
      &nbsp;&nbsp;&nbsp;<input type="reset" value="重置"><br>
    </form>
    </div>
    <div class='corner'>
		<a href="showTeacher.jsp">返回</a>
	</div>
  </body>
</html>
