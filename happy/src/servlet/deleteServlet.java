package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.gradeDao;
import entity.grade;

public class deleteServlet extends HttpServlet {

	public deleteServlet() {
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
		  grade g=new grade();
		  request.setCharacterEncoding("utf-8");
		  String id=request.getParameter("id").trim();
		 try{
			 gradeDao dao=new gradeDao();
			 if(dao.deleteGrade(Integer.parseInt(id))){
				 System.out.println("删除成功");
			 }
		 }catch(Exception e){
			 System.out.println("删除失败");
		 }
		 RequestDispatcher dispatcher=request.getRequestDispatcher("selectAll");
		 dispatcher.forward(request, response);	
		
	}

	
	public void init() throws ServletException {
		
	}

}
