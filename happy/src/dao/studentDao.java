package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.student;
import servlet.DBManager;

public class studentDao {
		 DBManager db=new DBManager();
		 public List selectOne(String sname){
			  ArrayList list=new ArrayList();
			  String sql="select * from student where sname='"+sname+"'";
			  ResultSet rs=db.executeQuery(sql);
			  try {
				while(rs.next()){
					  student t=new student();
					  t.setSno(rs.getInt("sno"));
					  t.setSname(rs.getString("sname"));
					  t.setSsex(rs.getString("ssex"));
					  t.setTel(rs.getString("tel"));
					  list.add(t);
				  }
			} catch (SQLException e) {
				e.printStackTrace();
			}
			  return list;
		  }
}
