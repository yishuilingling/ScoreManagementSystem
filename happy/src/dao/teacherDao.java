package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.grade;
import entity.teacher;
import servlet.DBManager;

public class teacherDao {
	 DBManager db=new DBManager();
	 public List selectOne(String tname){
		  ArrayList list=new ArrayList();
		  String sql="select * from teacher where tname='"+tname+"'";
		  ResultSet rs=db.executeQuery(sql);
		  try {
			while(rs.next()){
				  teacher t=new teacher();
				  t.setTno(rs.getInt("tno"));
				  t.setTname(rs.getString("tname"));
				  t.setTsex(rs.getString("tsex"));
				  t.setTel(rs.getInt("tel"));
				  list.add(t);
			  }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		  return list;
	  }

}
