package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	protected static Connection con = null;
	protected ResultSet rs = null;
	private Statement stmt=null;

	public void getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=happy","sa","123456");
			System.out.println("连接数据库成功");
		} catch (SQLException e) {
			System.out.println("连接数据库失败");
			e.printStackTrace();
		}
	}
	public ResultSet executeQuery(String sql){//查询语句
		try{
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
		}catch(SQLException e){
			System.out.println("SQL语句执行错误");
		}
		return rs;
	}
     
	public int executeUpdate(String sql){//其他语句
		int count=0;
		try{
			stmt=con.createStatement();
			count=stmt.executeUpdate(sql);
		}catch(SQLException e){
			System.out.println("SQL语句执行错误");
		}
		return count;
	}
}
