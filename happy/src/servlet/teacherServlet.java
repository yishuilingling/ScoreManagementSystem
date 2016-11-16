package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.gradeDao;
import dao.teacherDao;

public class teacherServlet extends HttpServlet {

	
	public teacherServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); 
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		teacherDao dao=new teacherDao();
		HttpSession session=request.getSession();
		request.setCharacterEncoding("utf-8");
		String name=(String)session.getAttribute("name");
		System.out.println(name);
		ArrayList list=new ArrayList();
		list=(ArrayList) dao.selectOne(name);
        session.setAttribute("tlist", list);
		RequestDispatcher dispatcher=request.getRequestDispatcher("teacher.jsp");
		dispatcher.forward(request, response);
	}

	
	public void init() throws ServletException {
		
	}

}
