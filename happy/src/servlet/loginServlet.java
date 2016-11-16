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

public class loginServlet extends HttpServlet {
	DBManager db=new DBManager();
	
	public loginServlet() {
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
		       request.setCharacterEncoding("utf-8");
              db.getConnection();
              String type=(String)request.getParameter("type");
              int count=0;
              String name=(String)request.getParameter("name").trim();
              String password=(String)request.getParameter("password").trim();
              HttpSession session=request.getSession();
              if(type!=null){
              if(type.equals("teacher")){
              String sql="select * from teacher where tname='"+name+"' and pas='"+password+"'";
              ResultSet rs=db.executeQuery(sql);
              try{
            	  while(rs.next()){
            		  count++;
            	  }
              }catch(Exception e){
            	  
              }
		if(count>0){
			session.setAttribute("name", name);
			System.out.println("登录成功");
			response.sendRedirect("selectAll");
		}else{
			response.sendRedirect("index.jsp");
		}
      }
         if(type.equals("student")){
    	  String sql="select * from student where sname='"+name+"' and pas='"+password+"'";
          ResultSet rs=db.executeQuery(sql);
          try{
        	  while(rs.next()){
        		  count++;
        	  }
          }catch(Exception e){
        	  
          }
	if(count>0){
		session.setAttribute("name", name);
		System.out.println("登录成功");
		response.sendRedirect("selectTwo");
	    }else{
		response.sendRedirect("index.jsp");
	      }
      }
	}
}
	public void init() throws ServletException {
		
	}

}
