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

public class selectTwo extends HttpServlet {

	public selectTwo() {
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
		HttpSession session=request.getSession();
		request.setCharacterEncoding("utf-8");
		String name=(String)session.getAttribute("name");
		if(name==null||name.length()==0){
			session.setAttribute("selectTwo", "查询失败");
		}else{
		ArrayList list=new ArrayList();
		list=(ArrayList) dao.selectTwo(name);
        session.setAttribute("list", list);
		RequestDispatcher dispatcher=request.getRequestDispatcher("showStudent.jsp");
		dispatcher.forward(request, response);
	    }
	}

	public void init() throws ServletException {
		
	}

}
