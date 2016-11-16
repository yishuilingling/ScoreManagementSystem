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

public class updateServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;


	public updateServlet() {
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
		  String score=request.getParameter("score").trim();
		try{
			 g.setId(Integer.parseInt(id));
			 g.setScore(Integer.parseInt(score));
			 gradeDao dao=new gradeDao();
			 if(dao.updateGrade(g)){
				 System.out.println("修改成功");
			 }
		 }catch(Exception e){
			 System.out.println("修改失败");
		 }
		 RequestDispatcher dispatcher=request.getRequestDispatcher("selectAll");
		 dispatcher.forward(request, response);	
	}
	
	public void init() throws ServletException {
	}

}
