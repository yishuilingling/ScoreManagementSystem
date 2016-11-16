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

import dao.studentDao;
import dao.teacherDao;

public class studentServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public studentServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		studentDao dao=new studentDao();
		HttpSession session=request.getSession();
		request.setCharacterEncoding("utf-8");
		String name=(String)session.getAttribute("name");
		System.out.println(name);
		ArrayList list=new ArrayList();
		list=(ArrayList) dao.selectOne(name);
        session.setAttribute("slist", list);
		RequestDispatcher dispatcher=request.getRequestDispatcher("student.jsp");
		dispatcher.forward(request, response);
	}

	public void init() throws ServletException {

	}

}
