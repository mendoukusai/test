package com.siemens.ct.its.appsec.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserManageDao {
	public Boolean AddUser(String username,String password,String email,String code){
		Boolean result=false;
		Connection conn=null;
		String sql="insert into t_user(username,password,email,code,state) values(?,?,?,?,?)";
		try {
			//娉ㄥ唽椹卞姩
			Class.forName("com.mysql.jdbc.Driver");
			//寤虹珛杩炴帴
			conn=DriverManager.getConnection("jdbc:mysql://10.0.10.5:3306/SendMail","root","123456");
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,username);
			pstmt.setString(2,password);
			pstmt.setString(3,email);
			pstmt.setString(4,code);
			pstmt.setInt(5,0);
//			pstmt.execute();
			result=pstmt.executeUpdate()>0?true:false;	
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public String findUserByCode(String code) {
		String username="";
		Connection conn=null;
		ResultSet rs=null;
		String sql="select username from t_user where code=?";
		try {
			//娉ㄥ唽椹卞姩
			Class.forName("com.mysql.jdbc.Driver");
			//寤虹珛杩炴帴
			conn=DriverManager.getConnection("jdbc:mysql://10.0.10.5:3306/SendMail","root","123456");
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,code);			
			rs=pstmt.executeQuery();
			if(rs.next()){
				username=rs.getString("username");
			}			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return username;
	}
	
	/**
	 * 灏嗙敤鎴风姸鎬佽涓哄彲鐢�
	 * @param username
	 */
	public Boolean setState(String username) {
		Boolean result=false;
		Connection conn=null;
		String sql="update t_user set state=1 where username=?";
		try {
			//娉ㄥ唽椹卞姩
			Class.forName("com.mysql.jdbc.Driver");
			//寤虹珛杩炴帴
			conn=DriverManager.getConnection("jdbc:mysql://10.0.10.5:3306/SendMail","root","123456");
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,username);
			int i=pstmt.executeUpdate();
			if(i>0){
				result=true;
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
