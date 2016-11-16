package servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.gradeDao;
import entity.grade;

public class selectAll extends HttpServlet {

	public selectAll() {
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
		gradeDao dao=new gradeDao();
		request.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		ArrayList list=new ArrayList();
		list=(ArrayList) dao.selectAll();
        session.setAttribute("list", list);
		RequestDispatcher dispatcher=request.getRequestDispatcher("showTeacher.jsp");
		dispatcher.forward(request, response);
	}

	public void init() throws ServletException {
		
	}

}
