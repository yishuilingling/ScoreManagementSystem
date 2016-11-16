package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.grade;
import servlet.DBManager;

public class gradeDao {
	 DBManager db=new DBManager();
	public boolean addGrade(grade g){
		boolean flag=false;
         String sql="insert into grade values('"+g.getSno()+"','"+g.getCourse()+"','"+g.getScore()+"','"+g.getTname()+"','"+g.getId()+"')";
         int rs=db.executeUpdate(sql);System.out.println(sql);
         if(rs>0)
        	 flag=true;
         return flag;
	}
	
	public boolean updateGrade(grade g){
		 boolean flag=false;
         String sql="update grade set score='"+g.getScore()+"' where id='"+g.getId()+"'";
         int rs=db.executeUpdate(sql);
         if(rs>0)
        	 flag=true;
         return flag;
	}
	public boolean deleteGrade(int id){
		 boolean flag=false;
        String sql="delete from grade  where id='"+id+"'";
        int rs=db.executeUpdate(sql);
        if(rs>0)
       	 flag=true;
        return flag;
	}
  public List selectAll(){
	  ArrayList<grade> list=new ArrayList<grade>();
	  String sql="select * from grade order by id ASC";
	  ResultSet rs=db.executeQuery(sql);
	  try {
		while(rs.next()){
			  grade g=new grade();
			  g.setId(rs.getInt("id"));
			  g.setSno(rs.getInt("sno"));
			  g.setCourse(rs.getString("course"));
			  g.setScore(rs.getInt("score"));
			  g.setTname(rs.getString("tname"));
			  list.add(g);
		  }
	} catch (SQLException e) {
		e.printStackTrace();
	}
	  return list;
  }
  public List selectOne(int sno){
	  ArrayList<grade> list=new ArrayList<grade>();
	  String sql="select * from grade where sno='"+sno+"'";
	  ResultSet rs=db.executeQuery(sql);
	  try {
		while(rs.next()){
			  grade g=new grade();
			  g.setId(rs.getInt("id"));
			  g.setSno(rs.getInt("sno"));
			  g.setCourse(rs.getString("course"));
			  g.setScore(rs.getInt("score"));
			  g.setTname(rs.getString("tname"));
			  list.add(g);
		  }
	} catch (SQLException e) {
		e.printStackTrace();
	}
	  return list;
  }
  public List selectTwo(String name){
	  ArrayList<grade> list=new ArrayList<grade>();
	  String sql="select grade.* from grade,student where grade.sno=student.sno and sname='"+name+"'";
	  ResultSet rs=db.executeQuery(sql);
	  try {
		while(rs.next()){
			  grade g=new grade();
			  g.setId(rs.getInt("id"));
			  g.setSno(rs.getInt("sno"));
			  g.setCourse(rs.getString("course"));
			  g.setScore(rs.getInt("score"));
			  g.setTname(rs.getString("tname"));
			  list.add(g);
		  }
	} catch (SQLException e) {
		e.printStackTrace();
	}
	  return list;
  }
}
