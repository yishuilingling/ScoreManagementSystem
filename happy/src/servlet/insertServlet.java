package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.gradeDao;
import entity.grade;

public class insertServlet extends HttpServlet {
	public insertServlet() {
		super();
	}
	
	public void destroy() {
		super.destroy();
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  grade g=new grade();
	      request.setCharacterEncoding("utf-8");
		  String sno=request.getParameter("sno").trim();
		  String course=request.getParameter("course").trim();
		  String score=request.getParameter("score").trim();
		  String tname=request.getParameter("tname").trim();
		  String id=request.getParameter("id").trim();
		  HttpSession session=request.getSession();
		 try{
			 g.setSno(Integer.parseInt(sno));
			 g.setCourse(course);
			 g.setScore(Integer.parseInt(score));
			 g.setTname(tname);
			 g.setId(Integer.parseInt(id));
			 gradeDao dao=new gradeDao();
			 if(dao.addGrade(g)){
				 System.out.println("添加成功");
			 }
		 }catch(Exception e){
			 System.out.println("添加失败");
		 }
		 RequestDispatcher dispatcher=request.getRequestDispatcher("selectAll");
		 dispatcher.forward(request, response);
	}

	public void init() throws ServletException {
		
	}

}
